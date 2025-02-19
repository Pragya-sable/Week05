package com.practiceproblems.parsejsonandfilter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;
import java.util.stream.Collectors;
public class ParseJsonAndFilter {
    public static void main(String[] args) {
        String jsonArray = """
        [
            {"name": "Pragya", "email": "pragya@gmail.com", "age": 25},
            {"name": "Riya", "email": "riya@gmail.com", "age": 30},
            {"name": "Sakshi", "email": "sakshi@gmail.com", "age": 28}
        ]
        """;

        try {
            // Create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            // Parse JSON array into List of Person objects
            List<Person> people = objectMapper.readValue(jsonArray, new TypeReference<List<Person>>() {});

            // Filter records where age > 25
            List<Person> filteredPeople = people.stream()
                    .filter(person -> person.getAge() > 25)
                    .collect(Collectors.toList());

            // Convert filtered list back to JSON
            String filteredJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(filteredPeople);

            // Print the filtered JSON
            System.out.println(filteredJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
