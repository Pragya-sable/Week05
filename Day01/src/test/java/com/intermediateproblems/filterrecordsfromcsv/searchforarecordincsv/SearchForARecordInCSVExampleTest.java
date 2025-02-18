package com.intermediateproblems.filterrecordsfromcsv.searchforarecordincsv;

import com.intermediateproblems.filterrecordsfromcsv.FilterRecordsfromCSVExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchForARecordInCSVExampleTest {
    @Test
    void testSearchRecord(){
        // Specify file path for the test
        String filePath = "D:/Capgemini Training/Employee.csv";

        String result = SearchForARecordInCSVExample.searchRecord(filePath);

        String expectedOutput =   "Name: Pragya, Department: Finance, Salary: 62000\n";

        // Compare expected vs. actual output
        assertEquals(expectedOutput,result);
    }
}
