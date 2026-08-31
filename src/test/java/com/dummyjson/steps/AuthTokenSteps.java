package com.dummyjson.steps;
import com.dummyjson.config.DummyApiConfig;
import com.dummyjson.model.AddProductRequest;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static io.restassured.RestAssured.given;

public class AuthTokenSteps {
    private static final Logger log = LogManager.getLogger(AuthTokenSteps.class);
    public AuthTokenSteps(){

    }
    /**
     * Creates a reusable REST Assured request specification.
     */
    public   static RequestSpecification request() {

        return given()
                .baseUri(DummyApiConfig.BASE_URL)
                .contentType("application/json")
                .accept("application/json")
                .log().all();

    }
    public static Response getCurrentUser(Integer prodId) {
        return request()
                .pathParam("id", prodId)
                .when()
                .get(DummyApiConfig.productEndpoint)
                .then()
                .log().all()
                .extract()
                .response();
    }
    public static Response addProduct(AddProductRequest request) {

        return request()
                .body(request)
                .when()
                .post("/products/add")
                .then()
                .extract()
                .response();
    }


}
