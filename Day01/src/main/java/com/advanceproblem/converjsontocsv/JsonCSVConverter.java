package com.advanceproblem.converjsontocsv;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonCSVConverter {

    private static final String JSON_FILE = "students.json";
    private static final String CSV_FILE = "students.csv";

    public static void jsonToCSV(String jsonFilePath, String csvFilePath) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            // Read JSON file into a List of Students
            List<Student> students = objectMapper.readValue(new File(jsonFilePath), objectMapper.getTypeFactory().constructCollectionType(List.class, Student.class));

            // CSV writer
            CSVWriter csvWriter = new CSVWriter(new FileWriter(csvFilePath));

            // Write header
            String[] header = {"id", "name", "age", "marks"};
            csvWriter.writeNext(header);

            // Write student data
            for (Student student : students) {
                String[] data = {student.getId(), student.getName(), student.getAge(), String.valueOf(student.getMarks())};
                csvWriter.writeNext(data);
            }

            csvWriter.close();
            System.out.println("JSON to CSV conversion completed!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String jsonFilePath = "students.json";
        String csvFilePath = "students.csv";
        jsonToCSV(jsonFilePath, csvFilePath);
    }

    // Simple Student class for the data
    static class Student {
        private String id;
        private String name;
        private String age;
        private int marks;

        // Getters and setters
        public String getId() { return id; }
        public void setId(String id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getAge() { return age; }
        public void setAge(String age) { this.age = age; }
        public int getMarks() { return marks; }
        public void setMarks(int marks) { this.marks = marks; }
    }
}
