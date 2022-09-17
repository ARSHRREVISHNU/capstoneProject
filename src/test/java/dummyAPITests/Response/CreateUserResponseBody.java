package dummyAPITests.Response;

import com.beust.ah.A;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import dummyAPITests.Request.CreateUserRequestBody;
import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

@Getter
public class CreateUserResponseBody {

@Setter
public int statusCode;


private String id;
private String firstName;
private String lastName;
private String email;
private String registerDate;
private String updatedDate;

public void assertUserDetails(CreateUserRequestBody requestBody){
    Assert.assertEquals(getStatusCode(), 200);
    Assert.assertEquals(firstName, requestBody.getFirstName());
    Assert.assertEquals(lastName, requestBody.getLastName());
    Assert.assertEquals(email, requestBody.getEmail());
}

}
