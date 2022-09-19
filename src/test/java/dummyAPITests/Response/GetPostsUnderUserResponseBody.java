package dummyAPITests.Response;

import java.util.*;
import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

@Getter
public class GetPostsUnderUserResponseBody {
    @Setter
    private int statusCode;

    private List<Data> data;
    private int total;
    private int page;
    private int limit;


    @Getter
    public static class Data{
        private String id;
        private String image;
        private int likes;
        private String tags[];
        private String text;
        private String publishDate;
        private String updatedDate;
        private Owner owner;

        @Getter
        public static class Owner{
            private String id;
            private String firstName;
            private String lastName;
        }

    }

    public void  asserGetpostDetails(int statusCode, int total, int limit){
        Assert.assertEquals(getStatusCode(), statusCode);
        Assert.assertEquals(getTotal(), total);
        Assert.assertEquals(getLimit(), limit);
    }

}
