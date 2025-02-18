package com.advanceproblem.covertcsvdata.mergecsv;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MergeCSVTest {

    private static final String OUTPUT_FILE = "D:/Capgemini Training/OutputStudent.csv";

    @Test
    public void testMergeCSVFiles() throws IOException {
        String file1Path = "D:/Capgemini Training/Student1.csv"; // students1.csv path
        String file2Path = "D:/Capgemini Training/Student2.csv" ; // students2.csv path


        MergeTwoCSVExample.mergeCSVFiles(file1Path, file2Path, OUTPUT_FILE);


        File outputFile = new File(OUTPUT_FILE);
        assertTrue(outputFile.exists());


        List<String> lines = java.nio.file.Files.readAllLines(outputFile.toPath());

        assertTrue(lines.get(1).contains("101,Pragya,21,94,A"));

    }
}