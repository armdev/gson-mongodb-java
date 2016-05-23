package com.project.gson.adapter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class CustomAdapter implements JsonDeserializer<Customer> {

    @Override
    public Customer deserialize(JsonElement json, java.lang.reflect.Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jObj = json.getAsJsonObject();

        String id = jObj.get("_id").toString().replaceAll(".*\"(\\w+)\"}", "$1");

        String name = jObj.get("name") != null ? jObj.get("name").getAsString() : "";
        String email = jObj.get("email") != null ? jObj.get("email").getAsString() : "";
        String phone = jObj.get("phone") != null ? jObj.get("phone").getAsString() : "";
        int age = jObj.get("age") != null ? jObj.get("age").getAsInt() : 0;

        return new Customer(id, name, age, email, phone);
    }
}
