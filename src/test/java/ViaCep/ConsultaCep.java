package ViaCep;

import TestBases.TestBases;
import Utilidades.FileOperation;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ConsultaCep extends TestBases {
    private static final String cepValido = FileOperation.getProperties("Variables").getProperty("cepValido");

    @Test
    public void buscarCEPValido(){
        Response resposta = given()
                .spec(requestSpec)
                .basePath(PATH_WS)
                .log().body()
                .when()
                .get("/" + cepValido + PATH_FORMAT)
                .then()
                .spec(responseSpec)
                .and()
                .log()
                .body()
                .statusCode(200)
                .extract()
                .response();

        System.out.println(resposta.then().extract().path("cep").toString());
    }
}
