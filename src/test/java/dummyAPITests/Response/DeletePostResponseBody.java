package dummyAPITests.Response;

import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

@Getter
public class DeletePostResponseBody {

 @Setter
private int statusCode;

 private String id;

 public void  assertDeletedPost(String postId){
  Assert.assertEquals(getStatusCode(), 200);
  Assert.assertEquals(getId(), postId);
 }
}
