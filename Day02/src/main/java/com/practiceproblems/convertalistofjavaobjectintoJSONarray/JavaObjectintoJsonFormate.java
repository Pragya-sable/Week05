package com.practiceproblems.convertalistofjavaobjectintoJSONarray;

import org.json.JSONObject;
// Convert a list of Java objects into a JSON array
public class JavaObjectintoJsonFormate {
    private String brand;
    private String model;
    private int year;

    // Constructor
    public JavaObjectintoJsonFormate(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Convert Car object to JSON
    public JSONObject toJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("brand", this.brand);
        jsonObject.put("model", this.model);
        jsonObject.put("year", this.year);
        return jsonObject;
    }

    public static void main(String[] args) {
        // Create Car object
        JavaObjectintoJsonFormate car = new JavaObjectintoJsonFormate("Toyota", "Camry", 2022);

        // Convert to JSON
        JSONObject carJson = car.toJson();

        // Print JSON representation
        System.out.println(carJson.toString(4)); // Pretty print JSON with indentation
    }
}
