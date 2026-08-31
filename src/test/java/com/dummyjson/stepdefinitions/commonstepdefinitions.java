package com.dummyjson.stepdefinitions;

import com.dummyjson.model.AddProductRequest;
import com.dummyjson.model.LoginFactory;
import com.dummyjson.model.LoginRequest;
import com.dummyjson.model.ProductFactory;
import com.dummyjson.steps.AuthTokenSteps;
import com.dummyjson.utils.JsonUtils;
import com.fasterxml.jackson.databind.JsonNode;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;
import static org.junit.Assert.assertNotNull;

public class commonstepdefinitions{

    private final TestContext testContext;

    private JsonNode testData;
    private int expectedStatusCode;

    // PicoContainer injects TestContext
    public commonstepdefinitions (TestContext testContext) {
        this.testContext = testContext;
    }

//    @Given("I have login test data {string}")
//    public void iHaveLoginTestData(String testCaseId) throws IOException {
//
//        JsonNode testData =
//                JsonUtils.getLoginTestData(testCaseId);
//
//        LoginRequest loginrequest =
//                LoginFactory.createLoginRequest(testData);
//
//
//        testContext.setLoginRequest(loginrequest);
//    }
//
//    @When("I send the request with custid")
//
//    public void Isendtherequestwithcustid(){
//
//        Integer dynamicinputId = testContext.getLoginRequest()
//                        .getId();
//
//        System.out.println("Id is: " + dynamicinputId);
//        testContext.setResponse(AuthTokenSteps.getCurrentUser(dynamicinputId));
//
//    }
//    @Then("the response status code should match the expected status code")
//    public void verifyStatusCode() {
//
//        // Get actual status code from API response
//        int actualStatusCode =
//                testContext.getResponse().getStatusCode();
//
//        // Get expected status code from JSON test data
//        int expectedStatusCode =
//                testContext.getLoginRequest().getExpectedStatusCode();
//
//        // Validate expected vs actual
//        Assert.assertEquals(
//                "Status code does not match",
//                expectedStatusCode,
//                actualStatusCode
//        );
//        System.out.println("Codes are :" +actualStatusCode +":" +expectedStatusCode);
//    }

    @Given("I have add product test data {string}")
    public void iHaveaddproductTestData(String testCaseId) throws IOException {

        JsonNode testData =
                JsonUtils.getaddProdTestData(testCaseId);

        AddProductRequest addproductrequest =
                ProductFactory.createProductRequest(testData);


        testContext.setAddProductRequest(addproductrequest);
        int expectedStatusCode =
                testData.get("expectedStatusCode").asInt();

        testContext.setExpectedStatusCode(expectedStatusCode);
        System.out.println("added product from Anishtestdata");
    }

    @When("I send the request to add the product")
    public void iSendTheRequestToAddTheProduct() {

        AddProductRequest request =
                testContext.getAddProductRequest();

        Response response =
                AuthTokenSteps.addProduct(request);

        testContext.setResponse(response);

        System.out.println("Add Product Response:");
        response.prettyPrint();
    }
    @Then("the response status code should match the expected status code")
    public void verifyStatusCode() {

        // Get actual status code from API response
        int actualStatusCode =
                testContext.getResponse().getStatusCode();

        // Get expected status code from JSON test data
        int expectedStatusCode =
                testContext.getExpectedStatusCode();

        // Validate expected vs actual
        Assert.assertEquals(
                "Status code does not match",
                expectedStatusCode,
                actualStatusCode
        );
        System.out.println("Codes are :" +actualStatusCode +":" +expectedStatusCode);
        System.out.println("test execution completed e2e");
    }

}
