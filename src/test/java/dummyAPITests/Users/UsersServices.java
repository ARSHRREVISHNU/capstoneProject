package dummyAPITests.Users;

import dummyAPITests.Request.CreatePostRequestBody;
import dummyAPITests.Request.CreateUserRequestBody;
import dummyAPITests.Response.*;
import io.restassured.response.Response;

public class UsersServices {
    UsersClient usersClient = new UsersClient();
    public GetAllUsersResponseBody getAllUsers(){
        Response response = usersClient.getAll();
        GetAllUsersResponseBody getUserResponseBody = response.as(GetAllUsersResponseBody.class);
        getUserResponseBody.setStatusCode(response.getStatusCode());
        return getUserResponseBody;
    }


    public CreateUserResponseBody getCreatedUser(CreateUserRequestBody requestBody){
        Response response = usersClient.createUser(requestBody);
        CreateUserResponseBody createUserResponseBody = response.as(CreateUserResponseBody.class);
        createUserResponseBody.setStatusCode(response.getStatusCode());
        return createUserResponseBody;
    }


    public GetAllUsersResponseBody getUsersForMyId(){
        Response response = usersClient.getUsersUnderId();
        GetAllUsersResponseBody getAllUsersResponseBody = response.as(GetAllUsersResponseBody.class);
        getAllUsersResponseBody.setStatusCode(response.getStatusCode());
        return getAllUsersResponseBody;
    }

    public CreateUserDuplicateEmailId createWithDuplicateEmailId(CreateUserRequestBody requestBody){
        Response response = usersClient.createUser(requestBody);
        CreateUserDuplicateEmailId createUserDuplicateEmailId = response.as(CreateUserDuplicateEmailId.class);
        createUserDuplicateEmailId.setStatusCode(response.getStatusCode());
        return createUserDuplicateEmailId;
    }

    public CreatePostResponseBody createPostUnderId(CreatePostRequestBody requestBody){
        Response response = usersClient.createPost(requestBody);
        CreatePostResponseBody createPostResponseBody = response.as(CreatePostResponseBody.class);
        createPostResponseBody.setStatusCode(response.getStatusCode());
        return createPostResponseBody;
    }

    public GetPostsUnderUserResponseBody getPostsUnderId(){
        Response response = usersClient.getPosts();
        GetPostsUnderUserResponseBody getPostsUnderUserResponseBody = response.as(GetPostsUnderUserResponseBody.class);
        getPostsUnderUserResponseBody.setStatusCode(response.getStatusCode());
        return getPostsUnderUserResponseBody;
    }


    public GETPostResponseBody getPostById(String postId){
        Response response = usersClient.getPost(postId);
        GETPostResponseBody getPostResponseBody = response.as(GETPostResponseBody.class);
        getPostResponseBody.setStatusCode(response.getStatusCode());
        return getPostResponseBody;
    }

    public  DeletePostResponseBody deletePostById(String postId){
        Response response = usersClient.deletePost(postId);
        DeletePostResponseBody deletePostResponseBody = response.as(DeletePostResponseBody.class);
        deletePostResponseBody.setStatusCode(response.getStatusCode());
        return deletePostResponseBody;
    }

    public GETDeletedPostResponseBody getDeletedPost(String postId){
        Response response = usersClient.getPost(postId);
        GETDeletedPostResponseBody getDeletedPostResponseBody = response.as(GETDeletedPostResponseBody.class);
        getDeletedPostResponseBody.setStatusCode(response.getStatusCode());
        return getDeletedPostResponseBody;
    }


}
