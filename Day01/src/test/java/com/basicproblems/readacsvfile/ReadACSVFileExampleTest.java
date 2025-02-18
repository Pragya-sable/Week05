package com.basicproblems.readacsvfile;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadACSVFileExampleTest {
    @Test
    void testCSVFileExample(){

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ReadACSVFileExample.readFile(  "D:/Capgemini Training/Student.csv");
        System.setOut(System.out);
        // Expected Output
        String expectedOutput = "ID: Id , Name: Name ,Age: Age ,Marks: Marks\n"+
        "ID: 101 , Name: Pragya ,Age: 21 ,Marks: 94\n"+
        "ID: 102 , Name: Sakashi ,Age: 22 ,Marks: 95\n"+
        "ID: 103 , Name: Riya ,Age: 20 ,Marks: 93\n"+
        "ID: 104 , Name: Shubhi ,Age: 23 ,Marks: 90\n"+
        "ID: 105 , Name: Muskan ,Age: 19 ,Marks: 96\n";

        // Compare expected vs. actual output
        assertEquals(expectedOutput, outputStream.toString().replace("\r", ""));
    }

}
