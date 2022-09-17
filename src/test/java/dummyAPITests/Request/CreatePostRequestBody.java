package dummyAPITests.Request;

import lombok.Getter;

@Getter
public class CreatePostRequestBody {

 private String text;
 private String image;
 private int likes;
 private String owner;

 public CreatePostRequestBody(Builder builder){
     this.text = builder.text;
     this.image = builder.image;
     this.likes = builder.likes;
     this.owner = builder.owner;
 }

 public static class Builder{

     private String text;
     private String image;
     private int likes;
     private String owner;

     public Builder(){
         this.text = "2nd post";
         this.image = "image url";
         this.likes = 6;
         this.owner =  "6324b61a0f6bf1c728b108fc";
     }

     public Builder text(String text){
         this.text = text;
         return this;
     }

     public Builder image(String image){
         this.image = image;
         return this;
     }

     public Builder likes(int likes){
         this.likes = likes;
         return this;
     }
     public Builder owner(String owner){
         this.owner = owner;
         return this;
     }

     public CreatePostRequestBody build(){

         CreatePostRequestBody createPostRequestBody = new CreatePostRequestBody(this);
         return createPostRequestBody;
     }
 }


}
