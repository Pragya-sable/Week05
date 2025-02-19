package com.practiceproblems.javaobjectintojsonobject;

import com.fasterxml.jackson.databind.ObjectMapper;

// Convert a Java object (Car) into JSON format
public class CreateObject {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            Car car = new Car("Ford", 10000000,"Black");

            // Convert Java Object to JSON String
            String jsonString = objectMapper.writeValueAsString(car);
            System.out.println(jsonString);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
