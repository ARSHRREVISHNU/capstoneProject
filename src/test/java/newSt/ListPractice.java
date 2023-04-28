package newSt;

//import java.util.List;
import  java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListPractice {

    public void intListMethod(){
        String arr[] = {"1", "2"};
        List<String> intList = Arrays.asList(arr);

        List<Integer> list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(3);

        //Iterating through iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //Iterating through streams
        System.out.println("Iterating through streams.");
        list.stream().forEach(value -> System.out.println(value));

    }


    public void strListMethod(){
        List<String> list = new ArrayList<String>();

        list.add("Batman");
        list.add("Avatar");
        list.add("Thor");
        list.add("Avengers");
        list.add("Avengers");

        List<String> list2 = new ArrayList<String>();
        list2.add("Vikram");
        list.add("KGF");
        list.addAll(list2);


        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list.removeIf(i->i=="Avengers");

        Iterator<String> iterator1 = list.iterator();
        System.out.println("After removing avengers.");
        while(iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }
        //Iterating through streams
        System.out.println("Iterating through streams.");
        //As we are using Collectors.toSet() the duplicates was deleted where Avengers was present once.
        System.out.println("Print only if i have avengers");
        list.stream().filter( val -> val=="Avengers").collect(Collectors.toSet()).forEach(i-> System.out.println(i));

    }
    public static void main(String[] args) {
        ListPractice practice = new ListPractice();
        practice.intListMethod();
        practice.strListMethod();
    }


}
