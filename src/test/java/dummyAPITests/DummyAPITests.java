package dummyAPITests;

import dummyAPITests.Request.CreatePostRequestBody;
import dummyAPITests.Request.CreateUserRequestBody;
import dummyAPITests.Response.*;
import dummyAPITests.Users.UsersServices;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DummyAPITests {

    UsersServices usersServices;
    @BeforeClass
    public void before(){
        usersServices = new UsersServices();
    }


    @Test
    public void returnUsersList(){
        GetAllUsersResponseBody getUserResponseBody = usersServices.getAllUsers();
        Assert.assertEquals(getUserResponseBody.getStatusCode(), 200);
        Assert.assertEquals(getUserResponseBody.getLimit(), 10);
    }


    @Test
    public void createUserTest(){
        CreateUserRequestBody createUserRequestBody = new CreateUserRequestBody.Builder().build();
        CreateUserResponseBody responseBody = usersServices.getCreatedUser(createUserRequestBody);
        responseBody.assertUserDetails(createUserRequestBody);
    }


    @Test
    public void getUsersUnderMyIdTest(){
        GetAllUsersResponseBody getAllUsersResponseBody = usersServices.getUsersForMyId();
        Assert.assertEquals(getAllUsersResponseBody.getStatusCode(), 200);
        //Assert.assertEquals(getAllUsersResponseBody.getTotal(), 23);
        Assert.assertEquals(getAllUsersResponseBody.getLimit(), 20);
    }

    @Test
    public void createPostUnderMyIdTest(){
       CreatePostRequestBody createPostRequestBody = new CreatePostRequestBody.Builder().build();
       CreatePostResponseBody createPostResponseBody =  usersServices.createPostUnderId(createPostRequestBody);
       Assert.assertEquals(createPostResponseBody.getStatusCode(), 200);
       Assert.assertEquals(createPostRequestBody.getOwner(), "6324b61a0f6bf1c728b108fc");
    }
//
//    @Test(priority = 5)
//    public void getPostsByUserIdTest(){
//        GetPostsUnderUserResponseBody getPostsUnderUserResponseBody = usersServices.getPostsUnderId();
//        getPostsUnderUserResponseBody.asserGetpostDetails(200, 17, 10);
//    }
//
//    @Test(priority = 6)
//    public void getPostById(){
//        CreatePostRequestBody createPostRequestBody = new CreatePostRequestBody.Builder().build();
//        CreatePostResponseBody createPostResponseBody =  usersServices.createPostUnderId(createPostRequestBody);
//        GETPostResponseBody getPostResponseBody = usersServices.getPostById(createPostResponseBody.getId());
//        getPostResponseBody.assertPost(createPostResponseBody);
//    }
//
//    @Test(priority = 7)
//    public void deletePostById(){
//        DeletePostResponseBody deletePostResponseBody = usersServices.deletePostById("632956893a85879895d015bd");
//        deletePostResponseBody.assertDeletedPost("632956893a85879895d015bd");
//        GETDeletedPostResponseBody getDeletedPostResponseBody = usersServices.getDeletedPost("632956893a85879895d015bd");
//        getDeletedPostResponseBody.assertDeletedPost("RESOURCE_NOT_FOUND");
//    }
}
