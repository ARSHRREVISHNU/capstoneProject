package dummyAPITests.integrationTests;

import dummyAPITests.Request.CreatePostRequestBody;
import dummyAPITests.Response.CreatePostResponseBody;
import dummyAPITests.Response.DeletePostResponseBody;
import dummyAPITests.Response.GETDeletedPostResponseBody;
import dummyAPITests.Users.UsersServices;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EndToEndTest {
    UsersServices usersServices;
  @BeforeClass
  public void before(){

    usersServices = new UsersServices();
  }

  @Test
  public void integrationTests(){

    //Create the post
    CreatePostRequestBody createPostRequestBody = new CreatePostRequestBody.Builder().build();
    CreatePostResponseBody createPostResponseBody = usersServices.createPostUnderId(createPostRequestBody);
    createPostResponseBody.assertCreatedPost(createPostRequestBody);
    //Deletes the post
    DeletePostResponseBody deletePostResponseBody = usersServices.deletePostById(createPostResponseBody.getId());
    deletePostResponseBody.assertDeletedPost(createPostResponseBody.getId());
    //Checking the deleted post
    GETDeletedPostResponseBody getDeletedPostResponseBody = usersServices.getDeletedPost(createPostResponseBody.getId());
    getDeletedPostResponseBody.assertDeletedPost("RESOURCE_NOT_FOUND");
  }

}