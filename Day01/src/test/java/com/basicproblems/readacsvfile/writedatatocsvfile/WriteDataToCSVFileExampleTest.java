package com.basicproblems.readacsvfile.writedatatocsvfile;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WriteDataToCSVFileExampleTest {
   @Test
    void testWriteDataToCSVFile(){
       // Specify file path for the test
       String filePath = "D:/Capgemini Training/Employee.csv";

       // Call the method that writes data to CSV file
       WriteDataToCSVFileExample.writeFile(filePath);

       // Check if the file is created successfully
       File file = new File(filePath);
       assertTrue(file.exists(), "CSV file was not created");
   }
}

