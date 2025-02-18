package com.basicproblems.readacsvfile.readandcountrowsincsvfile;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
// Read and Count Rows in a CSV File
public class ReadAndCountRowsExample {
   public static int readRow(String filePath){
       int count = 0;
       // Read a CSV file
       try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
           // excluding the header row
           reader.skip(1);
           // count the number of records
           while ((reader.readNext()) != null) {
                count++;
           }
       } catch (IOException e) {
           e.printStackTrace();
       } catch (CsvValidationException e) {
           throw new RuntimeException(e);
       }
       return count;
   }
}
