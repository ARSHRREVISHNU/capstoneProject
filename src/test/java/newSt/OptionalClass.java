package newSt;

import java.util.Optional;

public class OptionalClass {

    public static String value(String str){
       // System.out.println(str.toLowerCase());
        return str;
    }

    public static void main(String[] args) {

     String s = value(null);

        Optional<String> emptyOptional = Optional.ofNullable(s);

        if(emptyOptional.isPresent()){
            System.out.println(emptyOptional.get());
        } else  {
            System.out.println(emptyOptional.orElse("Value was null"));
        }
/*

String s = object.method(null);

Optional<String> emptyOtionaql = Optional.ofNullable(s);
emptyOptional.isPresent()







 */





    }
}
