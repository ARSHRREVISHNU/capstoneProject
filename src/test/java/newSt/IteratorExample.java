package newSt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

       list.add("Noodles");
       list.add("Dosa");
       list.add("Idly");
       list.add("Cheese");
       list.add("Rasam");

        Iterator<String> iterator =  list.iterator();
       while(iterator.hasNext()){
           System.out.println(  iterator.next());
       }




    }

}
