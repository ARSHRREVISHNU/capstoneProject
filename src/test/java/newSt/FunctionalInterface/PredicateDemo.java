package newSt.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo implements Predicate<Integer> {



    @Override
    public boolean test(Integer integer) {

        if(integer%2 == 0)
            return true;
        else
        return false;
    }


    public static void main(String[] args) {


        Predicate<Integer> demo = integer -> integer%2==0;
        System.out.println(demo.test(10));


        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().filter(no -> no%2==0).forEach(integer -> System.out.println(integer));
    }


}
