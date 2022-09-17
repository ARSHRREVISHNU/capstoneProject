package dummyAPITests.Response;

import com.beust.ah.A;
import dummyAPITests.Request.CreatePostRequestBody;
import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

@Getter
public class CreatePostResponseBody {

    @Setter
    private int statusCode;

    private String id;
    private String image;
    private int likes;
    private String link;
    private String tags[];
    private String text;
    private String publishDate;
    private String updatedDate;
    private Owner owner;

    @Getter
    public class Owner{

        private String id;
        private String firstName;
        private String lastName;
    }


    public void assertCreatedPost(CreatePostRequestBody requestBody){
        Assert.assertEquals(getStatusCode(), 200);
        Assert.assertEquals(getText(), requestBody.getText());
        Assert.assertEquals(getOwner().getId(), requestBody.getOwner());
    }
}
