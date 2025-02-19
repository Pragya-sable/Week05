package com.iplandcensoranalyzer;

import com.opencsv.exceptions.CsvException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Process JSON file
            IPLJsonProcessor.processJson("D:\\Week05\\Day02\\src\\main\\java\\com\\iplandcensoranalyzer\\input_data.json", "D:\\Week05\\Day02\\src\\main\\java\\com\\iplandcensoranalyzer\\output_data.json");

            // Process CSV file
            IPLCsvProcessor.processCsv("D:\\Week05\\Day02\\src\\main\\java\\com\\iplandcensoranalyzer\\input_data.csv", "D:\\Week05\\Day02\\src\\main\\java\\com\\iplandcensoranalyzer\\output_data.csv");

            System.out.println("Data has been successfully sanitized and written to output files.");
        } catch ( IOException e) {
            e.printStackTrace();
        } catch (CsvException e) {
            throw new RuntimeException(e);
        }
    }
}
