package com.basicproblems.readacsvfile.readandcountrowsincsvfile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadAndCountRowsExampleTest {
    @Test
    void testReadAndCount(){
        // Specify file path for the test
        String filePath = "D:/Capgemini Training/Employee.csv";

        // Call the method
       int actualOutput = ReadAndCountRowsExample.readRow(filePath);
       // System.setOut(System.out);
        // Expected Output
        int expectedOutput = 5;

        // Compare expected vs. actual output
        assertEquals(expectedOutput, actualOutput);

    }
}
