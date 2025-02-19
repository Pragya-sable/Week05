package com.handsonpracticeproblems.covertlistofjavaobjectintojsonarray;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
            // Create a list of Car objects
            List<Car> carList = new ArrayList<>();
            carList.add(new Car("Toyota", "Camry", 2020));
            carList.add(new Car("Honda", "Civic", 2022));
            carList.add(new Car("Ford", "Mustang", 2021));

            // Create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            try {
                // Convert list of Car objects to JSON array
                String jsonArray = objectMapper.writeValueAsString(carList);

                // Print JSON array
                System.out.println(jsonArray);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}

