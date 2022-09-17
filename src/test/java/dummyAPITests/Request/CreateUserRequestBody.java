package dummyAPITests.Request;

import lombok.Getter;

import java.util.UUID;

@Getter
public class CreateUserRequestBody {


private String firstName;
private String lastName;
private String email;

public CreateUserRequestBody(Builder builder)
{
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.email = builder.email;
}


public static class Builder{
    private String firstName;
    private String lastName;
    private String email;

    public Builder()
    {
        this.firstName = "hello";
        this.lastName = "Sample";
        this.email = String.format("%s@fgmail.com", UUID.randomUUID());

    }

    public Builder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public Builder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public Builder email(String email){
        this.email = email;
        return this;
    }

    public CreateUserRequestBody build(){
        CreateUserRequestBody createUserRequestBody = new CreateUserRequestBody(this);
        return createUserRequestBody;
    }
    

}


}
