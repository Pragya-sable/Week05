package com.practiceproblems.jsonobjectforstudent;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

// Create a JSON object for a Student with fields:
// name, age, and subjects (array).
public class CreateObject {
    public static void main(String[] args) {
        JsonObject jsonObject =  new JsonObject();
        jsonObject.addProperty("name","Pragya");
        jsonObject.addProperty("age","21");

        JsonArray jsonArray = new JsonArray();
        jsonArray.add("DBMS");
        jsonArray.add("OOPM");
        jsonObject.add("Subject", jsonArray);

        System.out.println(jsonObject.toString());
    }


}
