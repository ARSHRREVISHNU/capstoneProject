package newSt;

import java.util.*;
import java.util.stream.Collectors;

public class SetPractice {

    public void stringSet(){

        Set<String> set = new HashSet<>();

        set.add("Value 1");
        set.add("Value 2");
        set.add("Value 3");
        set.add("Value 4");
        set.add("Value 4");
        set.add("Value 5");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<String> list = new ArrayList<>();
list.add("List 1");
list.add("List 2");
        Set<String> set2 = new HashSet<>();
        set2.add("Set 2 - 1");
        set2.add("Set 2 - 2");
        set2.add("Set 2 - 3");
        set2.add("Set 2 - 4");
        set2.addAll(list);
        System.out.println("Iterating using streams");
        set2.stream().filter(l -> l.contains("List")).collect(Collectors.toList()).forEach(l-> System.out.println(l));

        //
        System.out.println("Iterating using iterators");
        Iterator<String> iterator1 = set2.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());

        }







    }

    public static void main(String[] args) {

    SetPractice setPractice = new SetPractice();
    setPractice.stringSet();


    }

}
