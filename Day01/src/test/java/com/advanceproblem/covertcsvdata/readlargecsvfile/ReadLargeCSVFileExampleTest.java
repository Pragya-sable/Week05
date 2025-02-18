package com.advanceproblem.covertcsvdata.readlargecsvfile;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class ReadLargeCSVFileExampleTest {
    @Test
    public void testReadCSVInChunks() {

        String filePath = "D:/Capgemini Training/Large.csv";

        // Create a ByteArrayOutputStream to capture the console output.
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        // Set the system output to the custom output stream
        System.setOut(printStream);

        // Run the method under test
        ReadLargeCSVFileExample.readCSVInChunks(filePath);

        // Get the output as a string
        String output = outputStream.toString();

        // Validate the output - we expect it to print the processed records
        assertTrue(output.contains("Processed 100 records."), "Output should contain 'Processed 100 records.'");

        // More assertions can be added based on the expected number of records
    }
}
