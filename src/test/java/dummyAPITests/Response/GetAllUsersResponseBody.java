package dummyAPITests.Response;

import java.util.*;
import lombok.Getter;
import lombok.Setter;

@Getter
public class GetAllUsersResponseBody {

    @Setter
    private int statusCode;

    private int total;
    private int page;
    private int limit;
    private List<Data> data;

    @Getter
    public static class Data{
        private String id;
        private String title;
        private String firstName;
        private String lastName;
        private String picture;

    }

}
