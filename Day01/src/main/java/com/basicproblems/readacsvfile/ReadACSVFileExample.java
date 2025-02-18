package com.basicproblems.readacsvfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// Read a CSV File and Print Data
public class ReadACSVFileExample {

    public static void readFile( String filePath ){

        // Read a CSV file and handle the exception
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = bufferedReader.readLine()) != null){
               String[] columns = line.split(",");
                System.out.println("ID: "+columns[0]+" , Name: "+ columns[1]+" ,Age: "+ columns[2]+" ,Marks: "+ columns[3]);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

}
