package newSt;

import java.util.*;

public class TypesOfMapes {

    public void hashMapSample(){


        //hashmap
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(6, "RRR");
        map.put(1, "Avatar");
        map.put(2,"Trigger");
        map.put(5, "RRR");
        map.put(3, "Avengers");
        map.put(4, "Ayan");
        System.out.println("Hash Map");
       for(Map.Entry<Integer, String> entry: map.entrySet()){

           System.out.println(entry.getKey()+" "+entry.getValue());
        }

       //linkedhashmap
        Map<Integer, String> linkedhashMap = new LinkedHashMap<Integer, String>();
       linkedhashMap.put(1, "Avatar");
       linkedhashMap.put(6, "Trigger");
       linkedhashMap.put(5, "RRR");
       linkedhashMap.put(3, "Avengers");
       linkedhashMap.put(4, "Ayan");

        System.out.println("Linked Hashmap");
       for(Map.Entry<Integer, String> entry : linkedhashMap.entrySet())
        System.out.println(entry.getKey()+" "+entry.getValue());

       //Tree Map

        Map<Integer, String> treeMap = new TreeMap<Integer,  String>();
        treeMap.put(1, "Avatar");
        treeMap.put(6, "Ayan");
        treeMap.put(2, "Trigger");
        treeMap.put(3, "RRR");
        treeMap.put(5, "Avengers");
        treeMap.put(5, "Avengers");

        System.out.println("Tree Map");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());


    }
    public static void main(String[] args) {


        TypesOfMapes obj = new TypesOfMapes();
        obj.hashMapSample();

        }



}
