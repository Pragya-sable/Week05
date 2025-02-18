package com.intermediateproblems.sortcsvrecordbycolumn;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "D:/Capgemini Training/Employee.csv";// Path to the CSV file
        int topN = 5;
        SortCSVRecordExample.sortAndPrintTopSalaries(inputFilePath,topN);
    }
}
