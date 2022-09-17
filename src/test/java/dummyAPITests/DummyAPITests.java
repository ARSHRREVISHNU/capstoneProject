package dummyAPITests;

import dummyAPITests.Request.CreatePostRequestBody;
import dummyAPITests.Request.CreateUserRequestBody;
import dummyAPITests.Response.*;
import dummyAPITests.Users.UsersServices;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DummyAPITests {

    UsersServices usersServices;
    @BeforeClass
    public void before(){
        usersServices = new UsersServices();
    }


    @Test(priority = 1)
    public void returnUsersList(){

        GetAllUsersResponseBody getUserResponseBody = usersServices.getAllUsers();
        Assert.assertEquals(getUserResponseBody.getStatusCode(), 200);
        Assert.assertEquals(getUserResponseBody.getLimit(), 10);
    }


    @Test(priority = 2)
    public void createUserTest(){

        CreateUserRequestBody createUserRequestBody = new CreateUserRequestBody.Builder().build();
        CreateUserResponseBody responseBody = usersServices.getCreatedUser(createUserRequestBody);
        responseBody.assertUserDetails(createUserRequestBody);
    }


    @Test(priority = 3)
    public void getUsersUnderMyIdTest(){
        GetAllUsersResponseBody getAllUsersResponseBody = usersServices.getUsersForMyId();
        Assert.assertEquals(getAllUsersResponseBody.getStatusCode(), 200);
        Assert.assertEquals(getAllUsersResponseBody.getTotal(), 8);
        Assert.assertEquals(getAllUsersResponseBody.getLimit(), 20);
    }

    @Test(priority = 4)
    public void createPostUnderMyIdTest(){
        CreatePostRequestBody createPostRequestBody = new CreatePostRequestBody.Builder().build();
       CreatePostResponseBody createPostResponseBody =  usersServices.createPostUnderId(createPostRequestBody);
Assert.assertEquals(createPostResponseBody.getStatusCode(), 200);
Assert.assertEquals(createPostRequestBody.getOwner(), "6324b61a0f6bf1c728b108fc");
    }

    @Test(priority = 5)
    public void getPostsByUserIdTest(){

        GetPostsUnderUserResponseBody getPostsUnderUserResponseBody = usersServices.getPostsUnderId();
getPostsUnderUserResponseBody.asserGetpostDetails(200, 4, 10);

    }

    @Test(priority = 6)
    public void getPostById(){
        CreatePostRequestBody createPostRequestBody = new CreatePostRequestBody.Builder().build();
        CreatePostResponseBody createPostResponseBody =  usersServices.createPostUnderId(createPostRequestBody);
        GETPostResponseBody getPostResponseBody = usersServices.getPostById(createPostResponseBody.getId());

        getPostResponseBody.assertPost(createPostResponseBody);

    }

    @Test(priority = 7)
    public void deletePostById(){

        DeletePostResponseBody deletePostResponseBody = usersServices.deletePostById("632545375965a17ad756cfe3");
        deletePostResponseBody.assertDeletedPost("632545375965a17ad756cfe3");
        GETDeletedPostResponseBody getDeletedPostResponseBody = usersServices.getDeletedPost("632545375965a17ad756cfe3");
        getDeletedPostResponseBody.assertDeletedPost("RESOURCE_NOT_FOUND");


    }
}
