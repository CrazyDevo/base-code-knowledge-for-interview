package api_review.week02;

import api_review.week02.pojos.Product;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1 {

    RequestSpecification requestSpecification;
    @BeforeMethod
    public void setUp() {
        RestAssured.baseURI="https://fakestoreapi.com";
         requestSpecification= RestAssured.given()
                .accept(ContentType.JSON)
         ;
    }

    @Test
    public void testGetProducts() {

        Response response = requestSpecification
                .when()
                .get("/products");

        int actualStatusCode = response.statusCode();

        Assert.assertEquals(actualStatusCode, 200);

    }
/*
You will change your credential
You will change your bearer token
You will change your basic token
 */
    @Test
    public void testGetSingleProduct() {
        int productId = 1;
        Response response = requestSpecification
                .when()
                .get("/products/"+productId);

        Assert.assertEquals(response.statusCode(),200);

        response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();
        System.out.println("jsonPath.getInt(\"id\") = " + jsonPath.getInt("id"));
        System.out.println("jsonPath.getString(\"title\") = " + jsonPath.getString("title"));
        System.out.println("jsonPath.getDouble(\"rating.rate\") = " + jsonPath.getDouble("rating.rate"));


    }
    /*
    {
    "id": 1,
    "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
    "price": 109.95,
    "description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
    "category": "men's clothing",
    "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_t.png",
    "rating": {
        "rate": 3.9,
        "count": 120
    }
}
     */


    @Test
    public void testCreateProduct() {
        String expectedTitle="title";
Product product = new Product(1,expectedTitle,1.1,"desc","cat","http://test.com");
        Response post = requestSpecification
                .contentType(ContentType.JSON)
                .body(product)
                .when()
                .post("/products");

        post.prettyPrint();
        System.out.println("post.statusCode() = " + post.statusCode());
        String actualTitle = post.jsonPath().getString("title");
        Assert.assertEquals(post.statusCode(),201); // if it fails rest we will not check
        // if you use soft assertion then you will check all assertions at the end yuo will see the all results
        Assert.assertEquals(actualTitle,expectedTitle);

        Headers headers = post.headers();
        boolean hasHeaderWithName = headers.hasHeaderWithName("Content-Type");
        Assert.assertTrue(hasHeaderWithName);


    }
}
