package com.intermediateproblems.filterrecordsfromcsv.modifyacsvfile;

import com.intermediateproblems.modifyacsvfile.modifyacsvfile.ModifyACSVFileExample;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ModifyACSVFileExampleTest {


    private static final String TEST_INPUT_CSV = "D:/Capgemini Training/Employee.csv";
    private static final String TEST_OUTPUT_CSV = "D:/Capgemini Training/Employeeupdated.csv";

    @Test
    public void testSalaryUpdate() throws IOException {
        // Create a test CSV file
        createTestCSV();

        // Run the salary update function
        ModifyACSVFileExample.updateSalaries(TEST_INPUT_CSV, TEST_OUTPUT_CSV);

        // Read the updated file and check IT employees' salaries
        List<String> lines = Files.readAllLines(Paths.get(TEST_OUTPUT_CSV));
        for (String line : lines) {
            if (line.contains("IT")) {
                String[] columns = line.split(",");
                double salary = Double.parseDouble(columns[3]);
                assertTrue(salary > 60000); // Previous IT salary was 60000
            }
        }
    }

    private void createTestCSV() throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(TEST_INPUT_CSV))) {
            writer.println("Name,Department,Salary");
            writer.println("Pragya,IT,50000");

        }
    }
}
