package newSt.StringOperations;

import java.util.HashMap;
import java.util.Map;

public class PrintUniqueWordsString {

    public void uniqueElements(String str){

        str = str.toLowerCase();
        char ch[] = str.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char value: ch){

            if(map.containsKey(value)){

                map.put(value, map.get(value)+1);
            }
            else {
                map.put(value, 1);
            }

        }

        for (Map.Entry<Character, Integer> entry: map.entrySet()){


            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }


        }



    }

    public static void main(String[] args) {

            PrintUniqueWordsString uniqueWordsString = new PrintUniqueWordsString();
            uniqueWordsString.uniqueElements("Shrrevishnu A R");



    }

}
