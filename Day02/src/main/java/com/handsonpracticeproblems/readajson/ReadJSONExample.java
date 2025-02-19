package com.handsonpracticeproblems.readajson;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
// Read a JSON file and print all keys and values
public class ReadJSONExample {
    public static void main(String[] args) {
        try {
            // Create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            // Read the JSON file
            File jsonFile = new File("D:\\Week05\\Day02\\src\\main\\java\\com\\handsonpracticeproblems\\readajson\\data.json");
            JsonNode rootNode = objectMapper.readTree(jsonFile);

            // Iterate over the fields (keys) and print them with values
            rootNode.fields().forEachRemaining(field -> {
                String key = field.getKey();
                String value = field.getValue().asText(); // Get the value as a String
                System.out.println("Key: " + key + ", Value: " + value);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
