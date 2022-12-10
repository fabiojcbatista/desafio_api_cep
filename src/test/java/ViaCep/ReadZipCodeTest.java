package ViaCep;

import TestBases.TestBases;
import Utilidades.FileOperation;
import io.qameta.allure.*;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class ReadZipCodeTest extends TestBases {
    private static final String VALID_ZIPCODE = FileOperation.getProperties("Variables").getProperty("validZipCode");
    private static final String INVALID_ZIPCODE = FileOperation.getProperties("Variables").getProperty("invalidZipCode");

    @Description("Test valid Zip Code")
    @DisplayName("Creating test for valid Zip Code")
    @Step("Valid ZipCode: {validZipCode}.")
    @Link("https://viacep.com.br/ws/94440360/json")
    @Story("Test get Zip Code")
    @Test
    public void getValidZipCodeTest(){
        Response response =
                given()
                    .spec(requestSpec)
                    .basePath(PATH_WS)
                    .log().body()
                .when()
                    .get("/" + VALID_ZIPCODE + PATH_FORMAT)
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

    @Description("Test invalid Zip Code")
    @DisplayName("Creating test for invalid Zip Code")
    @Step("Invalid ZipCode: {invalidZipCode}.")
    @Link("https://viacep.com.br/ws/00000000/json")
    @Story("Test get Zip Code")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void getInvalidZipCodeTest(){
         given()
            .spec(requestSpec)
            .basePath(PATH_WS)
         .when()
            .get("/" + INVALID_ZIPCODE + PATH_FORMAT)
         .then()
            .spec(responseSpec)
            .log()
            .status()
            .statusCode(200)
            .body("erro" , equalTo (true));
    }
}