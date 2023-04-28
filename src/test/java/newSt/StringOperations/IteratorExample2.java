package newSt.StringOperations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample2 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();

        list.add("String");
        list.add("Integer");
        list.add("Float");
        list.add("Character");
        list.add("Float");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext())
            System.out.println(iterator.next());


    }


}
