package com.handsonpracticeproblems.validateanemailfield;
import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
// Validate an email field using JSON Schema.
public class JsonSchemaValidator {
    public static void main(String[] args) {
        try {
            // Define the JSON schema as a JSONObject
            String schemaString = "{\n" +
                    "  \"type\": \"object\",\n" +
                    "  \"properties\": {\n" +
                    "    \"email\": {\n" +
                    "      \"type\": \"string\",\n" +
                    "      \"format\": \"email\"\n" +
                    "    }\n" +
                    "  },\n" +
                    "  \"required\": [\"email\"]\n" +
                    "}";

            JSONObject schemaJson = new JSONObject(schemaString);
            Schema schema = SchemaLoader.load(schemaJson);

            // Sample JSON data to validate
            String jsonData = "{\"email\":\"test@example.com\"}";
            JSONObject jsonToValidate = new JSONObject(jsonData);

            // Validate the JSON data against the schema
            schema.validate(jsonToValidate);

            System.out.println("Email is valid!");
        } catch (ValidationException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }

}
