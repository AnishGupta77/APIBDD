package com.dummyjson.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginRequest {

    private Integer id;


    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer expectedStatusCode;


    // Default constructor
    public LoginRequest() {
    }

    // Parameterized constructor
    public LoginRequest(Integer id) {

        this.id = id;

    }

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExpectedStatusCode() {
        return expectedStatusCode;
    }

    public void setExpectedStatusCode(Integer expectedStatusCode) {
        this.expectedStatusCode = expectedStatusCode;
    }
}