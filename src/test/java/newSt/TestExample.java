package newSt;

import java.util.HashMap;
import java.util.Map;


public class TestExample {

public void sampleMethod(String str) {
    //How many times the given word was repeated
    str = str.toLowerCase();
    char strArray[] = str.toCharArray();
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    for (Character letter: strArray){

        if(letter == ' '){
            continue;
        }
        if(map.containsKey(letter)){
            map.put(letter, map.get(letter)+1);
        }
        else{
            map.put(letter,1);
        }

    }
for (Map.Entry entry: map.entrySet())
{
    System.out.println(entry.getKey()+" "+entry.getValue());

}
}



    public static void main(String[] args) {
        TestExample example = new TestExample();
        example.sampleMethod("Hi hello this is hi we hello are calling hi");
    }

}
