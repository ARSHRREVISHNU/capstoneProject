package newSt.FunctionalInterface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {



    public static void main(String[] args) {
        Supplier<String> integerSupplier = () ->
            "hi hello";



        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(integerSupplier));
    }


}
