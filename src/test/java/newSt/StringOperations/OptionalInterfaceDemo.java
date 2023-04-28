package newSt.StringOperations;

import java.util.Optional;

public class OptionalInterfaceDemo {

    public String sampleMethod(){

        return "Non null string.";
    }


    public static void main(String[] args) {


        OptionalInterfaceDemo optionalInterfaceDemo = new OptionalInterfaceDemo();

        String str = optionalInterfaceDemo.sampleMethod();

        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(Optional.of(str));
        //Optional.empty();
        if(optional.isPresent()){
            optional.get();
        }
        else {
            System.out.println(optional.orElse("Str"));
        }
        System.out.println(optional);

    }


}
