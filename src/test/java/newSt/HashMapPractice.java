package newSt;


import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {


    public void streams(){

        Map<Integer, String> map = new HashMap();
        map.put(1, "Arulmozhi varman");
        map.put(2, "Adhitha karikalan");
        map.put(3, "Nandhini");
        map.put(4, "periya pazhuvettaiyar");


        for(Map.Entry<Integer, String> entry: map.entrySet()){

            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }


    public void hashMap(){

        Map<Integer, String> hash = new HashMap<Integer, String>();

        hash.put(1, "Name");
        hash.put(2, "Address");
        hash.put(3, "Mobile no");
        hash.put(4, "City");
        hash.put(5, "Loaction");

        for(Map.Entry<Integer, String> entreySet: hash.entrySet()){
            System.out.println(entreySet.getKey()+" "+entreySet.getValue());
        }
    }

    public void hashMapOne(){

        Map<String, Integer> map = new HashMap<String, Integer>();


        map.put("Name", 1);
        map.put("Address", 2);
        map.put("City", 3);
        map.put("Location", 4);


        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }



    public void hashMapTwo(){

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Value");
        map.put(2, "Value 2");
        map.put(3, "Value 3");
        map.put(4, "Value 4");

        Map<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(5, "Value 5");
        map2.putAll(map);

        for(Map.Entry<Integer, String> entry : map2.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
    public static void main(String[] args) {
            HashMapPractice hashMapPractice = new HashMapPractice();
            hashMapPractice.streams();
            hashMapPractice.hashMap();

    }


}

