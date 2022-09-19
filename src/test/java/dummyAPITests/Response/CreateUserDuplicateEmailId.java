package dummyAPITests.Response;

import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

@Getter
public class CreateUserDuplicateEmailId {

    @Setter
    private int statusCode;
    private String error;
    private Data data;

    public void assertDuplicateMailId(int statusCode, String errorMessage, String emailMessage){
        Assert.assertEquals(getStatusCode(), statusCode);
        Assert.assertEquals(getError(), errorMessage);
        Assert.assertEquals(getData().getEmail(), emailMessage);
    }
    @Getter
    public class Data{
        String email;
    }




}
