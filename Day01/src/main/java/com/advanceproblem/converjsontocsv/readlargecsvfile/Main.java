package com.advanceproblem.converjsontocsv.readlargecsvfile;

public class Main {
    public static void main(String[] args) {
        String filePath = "D:/Capgemini Training/Large.csv";  // Path to the large CSV file
        ReadLargeCSVFileExample.readCSVInChunks(filePath);
    }
}
