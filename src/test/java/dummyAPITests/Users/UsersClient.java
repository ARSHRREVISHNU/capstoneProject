package dummyAPITests.Users;

import dummyAPITests.Request.CreatePostRequestBody;
import dummyAPITests.Request.CreateUserRequestBody;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UsersClient {

    public Response getAll(){
        Response response =
        given()
                .header("app-id", "63232a178f9470ed08c6f4be")
                .queryParam("limit", 10)
                        .when()
                    .get("https://dummyapi.io/data/v1/user/");
        response
                .then()
                    .log().body();
         return response;
    }


    public Response  createUser(CreateUserRequestBody requestBody){

        Response response =
                 given()
                    .header("app-id", "63232a178f9470ed08c6f4be")
                    .accept(ContentType.JSON)
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                .when()
                    .post("https://dummyapi.io/data/v1/user/create");
        response
                .then()
                    .log().body();
        return response;
    }

    public Response getUsersUnderId(){
        Response response =
                given()
                    .header("app-id", "63232a178f9470ed08c6f4be")
                    .queryParam("created", 1)
                .when()
                    .get("https://dummyapi.io/data/v1/user");
        response
                .then()
                    .log().body();
        return response;
    }

    public  Response createPost(CreatePostRequestBody requestBody){
        Response response =
                given()
                    .header("app-id", "63232a178f9470ed08c6f4be")
                    .accept(ContentType.JSON)
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                .when()
                    .post("https://dummyapi.io/data/v1/post/create");
        response
                .then()
                    .log().body();
        return response;
    }


    public Response getPosts()
    {
        Response response =
                given()
                    .header("app-id", "63232a178f9470ed08c6f4be")
                    .pathParam("user_id", "6324b61a0f6bf1c728b108fc")
                    .queryParam("limit", "10")
                .when()
                    .get("https://dummyapi.io/data/v1/user/{user_id}/post");
        response
                .then()
                    .log().body();
        return response;
    }


    public Response getPost(String postId){

        Response response =
                given()
                    .header("app-id", "63232a178f9470ed08c6f4be")
                    .pathParam("post_id", postId)
                .when()
                    .get("https://dummyapi.io/data/v1/post/{post_id}");
                response
                .then()
                     .log().body();
         return response;
    }

    public Response deletePost(String postId){
        Response response =
                given()
                    .header("app-id", "63232a178f9470ed08c6f4be")
                    .pathParam("post_id", postId)
                .when()
                    .delete("https://dummyapi.io/data/v1/post/{post_id}");
        response
                .then()
                    .log().body();
        return response;

    }
}
