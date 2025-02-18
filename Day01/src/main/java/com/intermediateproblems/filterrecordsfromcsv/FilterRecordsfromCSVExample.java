package com.intermediateproblems.filterrecordsfromcsv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
// Filter Records from CSV
public class FilterRecordsfromCSVExample {

        public static String filterFile(String filePath){
            StringBuilder result = new StringBuilder();
            // Read a CSV file
            try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
                reader.readNext();
                String[] nextLine;


                while ((nextLine = reader.readNext()) != null) {
                    // filter students who have scored more than 80 marks
                    int marks = Integer.parseInt(nextLine[3]);
                      if(marks > 80) {
                          // Append the qualifying records to the result
                          result.append("ID: ").append(nextLine[0])
                                  .append(", Name: ").append(nextLine[1])
                                  .append(", Age: ").append(nextLine[2])
                                  .append(", Marks: ").append(nextLine[3])
                                  .append("\n");
                      }
                }

            } catch (IOException e) {
                e.printStackTrace();
            } catch (CsvValidationException e) {
                throw new RuntimeException(e);
            }
            return result.toString();

        }
}
