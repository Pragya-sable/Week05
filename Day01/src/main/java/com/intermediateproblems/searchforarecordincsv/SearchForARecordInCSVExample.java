package com.intermediateproblems.searchforarecordincsv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
// Search for a Record in CSV
public class SearchForARecordInCSVExample {
    public static String searchRecord(String filePath){
        StringBuilder result = new StringBuilder();
        // Read a CSV file
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            reader.readNext();
            String[] nextLine;


            while ((nextLine = reader.readNext()) != null) {
              //  search for an employee by name.
                String name = nextLine[1];
                if(name.equalsIgnoreCase("Pragya")) {
                    // Append the records to the result
                    result.append("Name: ").append(nextLine[1])
                            .append(", Department: ").append(nextLine[2])
                            .append(", Salary: ").append(nextLine[3])
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
