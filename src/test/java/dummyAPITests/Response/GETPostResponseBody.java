package dummyAPITests.Response;

import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

@Getter
public class GETPostResponseBody {

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


public void assertPost(CreatePostResponseBody createPostResponseBody){

    Assert.assertEquals(getStatusCode(), 200);
    Assert.assertEquals(getId(), createPostResponseBody.getId());
    Assert.assertEquals(getImage(), createPostResponseBody.getImage());
    Assert.assertEquals(getLikes(), createPostResponseBody.getLikes());
    Assert.assertEquals(getLink(), createPostResponseBody.getLink());
    Assert.assertEquals(getText(), createPostResponseBody.getText());
    Assert.assertEquals(getOwner().getId(), createPostResponseBody.getOwner().getId() );
    Assert.assertEquals(getOwner().getFirstName(), createPostResponseBody.getOwner().getFirstName());
    Assert.assertEquals(getOwner().getLastName(), createPostResponseBody.getOwner().getLastName());
}

    @Getter
    public static class Owner{

        private String id;
        private String firstName;
        private String lastName;
    }
}
