package com.dummyjson.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.dummyjson.config.DummyApiConfig;

public class LoginFactory {

    public static LoginRequest createLoginRequest(JsonNode testData) {

        LoginRequest loginrequest = new LoginRequest();

        // Test validation data - NOT sent to API
        if (testData.has("expectedStatusCode")) {
            loginrequest.setExpectedStatusCode(
                    testData.get("expectedStatusCode").asInt()
            );
        }

        if (testData.has("id")) {
            loginrequest.setId(
                    testData.get("id").asInt()
            );
        }

        return loginrequest;
    }
}