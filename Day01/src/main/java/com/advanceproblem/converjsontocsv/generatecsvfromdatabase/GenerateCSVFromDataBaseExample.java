package com.advanceproblem.converjsontocsv.generatecsvfromdatabase;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
public class GenerateCSVFromDataBaseExample {
    private static final String JDBC_URL = "jdbc:oracle:thin:@//pragyasable:1521/xe";
    private static final String USERNAME = "pragyasable";
    private static final String PASSWORD = "pragya";
    private static final String CSV_FILE_PATH = "D:/Capgemini Training/Employee.csv";

    public static void exportToCSV() {
        String query = "SELECT employee_id, name, department, salary FROM employees";

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             FileWriter csvWriter = new FileWriter(CSV_FILE_PATH)) {


            csvWriter.append("Employee ID,Name,Department,Salary\n");
            // Writing the data rows
            while (rs.next()) {
                csvWriter.append(rs.getString("employee_id")).append(",");
                csvWriter.append(rs.getString("name")).append(",");
                csvWriter.append(rs.getString("department")).append(",");
                csvWriter.append(rs.getString("salary")).append("\n");
            }

            System.out.println("CSV file generated successfully: " + CSV_FILE_PATH);

        } catch (SQLException | IOException e) {
            System.err.println("Error exporting data to CSV: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        exportToCSV();
    }
}
