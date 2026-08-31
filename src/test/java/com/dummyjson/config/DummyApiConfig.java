package com.dummyjson.config;

public class DummyApiConfig {
    private DummyApiConfig() {
        // utility class
    }

    public static final String BASE_URL = System.getProperty(
            "base.url", "https://dummyjson.com");

    public static final String productEndpoint = "/products/{id}";
    public static final String addprodEndpoint = "/products/add";

}
