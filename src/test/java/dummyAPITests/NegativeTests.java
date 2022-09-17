package dummyAPITests;

import dummyAPITests.Request.CreateUserRequestBody;
import dummyAPITests.Response.CreateUserDuplicateEmailId;
import dummyAPITests.Response.CreateUserResponseBody;
import dummyAPITests.Users.UsersClient;
import dummyAPITests.Users.UsersServices;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NegativeTests {
    UsersServices usersServices;
    @BeforeClass
    public void before(){

usersServices = new UsersServices();

    }


@Test
public void duplicateEmailIdTest(){
    CreateUserRequestBody createUserRequestBody = new CreateUserRequestBody.Builder().email("hello123wujik@gmail.com").build();
    CreateUserDuplicateEmailId createUserDuplicateEmailId = usersServices.createWithDuplicateEmailId(createUserRequestBody);
    createUserDuplicateEmailId.assertDuplicateMailId(400, "BODY_NOT_VALID", "Email already used");

    }
    
}
