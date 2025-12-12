package api_review;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1 {


    @BeforeMethod
    public void setUp() {

        RestAssured.baseURI="https://automationexercise.com/api";
    }

    //   String baseURI="https://automationexercise.com/api";
    @Test
    public void testFetchBrandsList() {

   //     String branListURI=baseURI+"/brandsList";

        /*
        given()
        -header (Accept - Content)

        -spec
        - body

         */

      Response response= RestAssured.given()
               // .accept(ContentType.JSON) //hey api I want to get my response in JSON format

              .header("Accept","application/json")
                .when()
                .get("/brandsList");

      response.prettyPrint();


    }

    @Test
    public void testFetchProductsList() {
        Response response= RestAssured.given()
                // .accept(ContentType.JSON) //hey api I want to get my response in JSON format
               // .header("Accept","application/json")
                .contentType("text/html; charset=utf-8")
                .when()
                .get("/productsList");

        response.prettyPrint();


    }
}
