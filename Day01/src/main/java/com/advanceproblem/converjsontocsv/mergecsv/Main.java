package com.advanceproblem.converjsontocsv.mergecsv;

public class Main {
    public static void main(String[] args) {
        String file1Path = "D:/Capgemini Training/Student1.csv"; // students1.csv path
        String file2Path = "D:/Capgemini Training/Student2.csv" ; // students2.csv path
        String outputPath = "D:/Capgemini Training/OutputStudent.csv";  // Output file path

        MergeTwoCSVExample.mergeCSVFiles(file1Path, file2Path, outputPath);
    }
}
