package newSt;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {

//List<String> list =
public void data(){


    List<String> stringList = new ArrayList<String>();

    stringList.add("Value 1");
    stringList.add("Value 2");
    stringList.add("Value 3");

    Iterator<String> iterator= stringList.iterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }


}



    public static void main(String[] args) {

    MapAndFlatMap mapAndFlatMap = new MapAndFlatMap();

    mapAndFlatMap.data();



    }
}
