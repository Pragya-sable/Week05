package com.iplandcensoranalyzer;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class IPLCsvProcessor {

    public static void processCsv(String inputFile, String outputFile) throws IOException, CsvException {
        // Read input CSV data
        CSVReader csvReader = new CSVReader(new FileReader(inputFile));
        List<String[]> rows = csvReader.readAll();
        csvReader.close();

        // Process each row and apply censorship
        for (String[] row : rows) {
            row[1] = Censorship.maskTeamName(row[1]); // team1
            row[2] = Censorship.maskTeamName(row[2]); // team2
            row[6] = Censorship.redactPlayerOfMatch(row[6]); // player_of_match
        }

        // Write sanitized CSV data to a new file
        CSVWriter csvWriter = new CSVWriter(new FileWriter(outputFile));
        csvWriter.writeAll(rows);
        csvWriter.close();
    }
}