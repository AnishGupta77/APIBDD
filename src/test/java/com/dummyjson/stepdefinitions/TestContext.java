package com.dummyjson.stepdefinitions;

import com.dummyjson.model.AddProductRequest;
import com.dummyjson.model.LoginRequest;
import io.restassured.response.Response;

/**
 * Scenario-scoped context object, injected by Cucumber PicoContainer
 * into every step definition class for a given scenario. Holds state
 * shared across steps (e.g. the last request payload and response)
 * so scenarios don't rely on static/shared fields.
 */
public class TestContext {

    //private LoginRequest loginrequest;
    private Response response;
    private AddProductRequest addProductRequest;
    private Integer expectedStatusCode;


//    public LoginRequest getLoginRequest() {
//        return loginrequest;
//    }
//
//    public void setLoginRequest(LoginRequest loginrequest) {
//        this.loginrequest = loginrequest;
//    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public AddProductRequest getAddProductRequest() {
        return addProductRequest;
    }

    public void setAddProductRequest(AddProductRequest addProductRequest) {
        this.addProductRequest = addProductRequest;
    }

    public Integer getExpectedStatusCode() {
        return expectedStatusCode;
    }

    public void setExpectedStatusCode(
            Integer expectedStatusCode) {
        this.expectedStatusCode = expectedStatusCode;
        System.out.println("Expected Response Status code updated:");
    }

}
