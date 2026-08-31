package com.dummyjson.model;

import com.dummyjson.model.AddProductRequest;
import com.fasterxml.jackson.databind.JsonNode;

public class ProductFactory {

    public static AddProductRequest createProductRequest(
            JsonNode testData) {

        AddProductRequest request =
                new AddProductRequest();

        request.setTitle(
                testData.get("title").asText()
        );

        request.setPrice(
                testData.get("price").asDouble()
        );

        request.setStock(
                testData.get("stock").asInt()
        );

        return request;
    }
}