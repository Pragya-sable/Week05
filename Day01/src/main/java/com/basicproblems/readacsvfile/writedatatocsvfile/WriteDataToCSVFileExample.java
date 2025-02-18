package com.basicproblems.readacsvfile.writedatatocsvfile;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
// Write Data to a CSV File
public class WriteDataToCSVFileExample {

    public static void writeFile(String filePath){

        try(CSVWriter writer = new CSVWriter(new FileWriter(filePath))){

            // Write data into the file
            String[] header = {"ID", "Name", "Department", "Salary"};
            String[] emp1 = {"101", "Pragya", "Finance", "62000"};
            String[] emp2 = {"102", "Riya", "Sales", "52000"};
            String[] emp3 = {"103", "Sakshi", "Sales", "56000"};
            String[] emp4 = {"104", "Shubhi", "Sales", "57000"};
            String[] emp5 = {"105", "Muskan", "Sales", "50000"};

            writer.writeNext(header);
            writer.writeNext(emp1);
            writer.writeNext(emp2);
            writer.writeNext(emp3);
            writer.writeNext(emp4);
            writer.writeNext(emp5);
            System.out.println("CSV file written successfully using OpenCSV!");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
