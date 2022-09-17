package dummyAPITests.Response;

import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

@Getter
public class GETDeletedPostResponseBody {
    @Setter
    private int statusCode;

    private String error;

    public void assertDeletedPost(String errorMessage){

        Assert.assertEquals(getStatusCode(), 404);
        Assert.assertEquals(getError(), errorMessage);
    }

}
