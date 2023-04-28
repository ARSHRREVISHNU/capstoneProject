package newSt.StringOperations;

import java.util.HashMap;
import java.util.Map;

public class NoOfTimesEachWordOccuredInAString {

    public void noOfOccurence(String str){

        str = str.toLowerCase();

        String charStr[] = str.split(" ");

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String word: charStr){

            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }
            else {
                map.put(word,1);
            }
        }
        for (Map.Entry entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }


    public static void main(String[] args) {
        NoOfTimesEachWordOccuredInAString obj = new NoOfTimesEachWordOccuredInAString();
        obj.noOfOccurence("Hi I am Present Hi hello hi Hello Man Vishnu Shrre am I shrre vishnu");

    }

}
