package com.dummyjson.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonUtils {

    private static final ObjectMapper mapper =
            new ObjectMapper();

    private static final String JSON_FILE =
            "src/test/resources/testdata/addproductdata.json";

    public static JsonNode getLoginTestData(String testCaseId)
            throws IOException {

        JsonNode rootNode =
                mapper.readTree(new File(JSON_FILE));

        JsonNode testData = rootNode.get(testCaseId);

        if (testData == null) {
            throw new RuntimeException(
                    "Login test data not found for: " + testCaseId
            );
        }

        return testData;
    }

    public static JsonNode getaddProdTestData(String testCaseId)
            throws IOException {

        JsonNode rootNode =
                mapper.readTree(new File(JSON_FILE));

        JsonNode testData = rootNode.get(testCaseId);

        if (testData == null) {
            throw new RuntimeException(
                    "Login test data not found for: " + testCaseId
            );
        }

        return testData;
    }


}