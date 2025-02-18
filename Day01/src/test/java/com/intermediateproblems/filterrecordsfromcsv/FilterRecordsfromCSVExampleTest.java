package com.intermediateproblems.filterrecordsfromcsv;

import com.basicproblems.readandcountrowsincsvfile.ReadAndCountRowsExample;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilterRecordsfromCSVExampleTest {
    @Test
    void testFilterRecord(){
        // Specify file path for the test
        String filePath = "D:/Capgemini Training/Student.csv";

       String result = FilterRecordsfromCSVExample.filterFile(filePath);

        // Expected Output
        String expectedOutput = "ID: 101, Name: Pragya, Age: 21, Marks: 94\n" +
                "ID: 102, Name: Sakashi, Age: 22, Marks: 95\n" +
                "ID: 103, Name: Riya, Age: 20, Marks: 93\n" +
                "ID: 104, Name: Shubhi, Age: 23, Marks: 90\n" +
                "ID: 105, Name: Muskan, Age: 19, Marks: 96\n";

        // Compare expected vs. actual output
        assertEquals(expectedOutput,result);
    }
}
