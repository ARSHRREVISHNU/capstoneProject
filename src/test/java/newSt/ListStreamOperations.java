package newSt;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListStreamOperations {

public void listArray(){
    Integer arr[] = {2,4,5,6,7,8};

    List<Integer> list = new ArrayList<>(Arrays.asList(arr));

    list.stream().forEach(i->
        System.out.println(i + " ")
    );
}


    public static void main(String[] args) {
        ListStreamOperations listStreamOperations = new ListStreamOperations();
        listStreamOperations.listArray();
    }


}
