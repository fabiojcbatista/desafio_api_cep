package ViaCep;

import TestBases.TestBases;
import Utilidades.FileOperation;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;


import static io.restassured.RestAssured.given;

public class ReadZipCode extends TestBases {
    private static final String validZipCode = FileOperation.getProperties("Variables").getProperty("validZipCode");
    private static final String invalidZipCode = FileOperation.getProperties("Variables").getProperty("invalidZipCode");

    @Test
    public void getValidZipCode(){
        Response response = given()
                .spec(requestSpec)
                .basePath(PATH_WS)
                .log().body()
                .when()
                .get("/" + validZipCode + PATH_FORMAT)
                .then()
                .spec(responseSpec)
                .and()
                .log()
                .body()
                .statusCode(200)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schemas/json-schema.json"))
                .extract().response();

        System.out.println(response.then().extract().path("cep").toString());
    }

    @Test
    public void getInvalidZipCode(){
         given()
                .spec(requestSpec)
                .basePath(PATH_WS)
                 .when()
                .get("/" + invalidZipCode + PATH_FORMAT)
                .then()
                .spec(responseSpec)
                .log()
                 .status()
                 .statusCode(200)
                 .body("erro" , equalTo (true));
    }
}