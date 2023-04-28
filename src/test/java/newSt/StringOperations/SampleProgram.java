package newSt.StringOperations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SampleProgram {

    public void method1(String str1){

        str1 = str1.toLowerCase();
        String arr[] = str1.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
         for(String str: arr){
             if(map.containsKey(str))
             {
                 map.put(str, map.get(str)+1);
             }
             else {
                 map.put(str, 1);
             }
         }

         for(Map.Entry<String,Integer> entry: map.entrySet())
         {
             System.out.println(entry.getKey()+" "+entry.getValue());
         }
    }



    public static void main(String args[]){
        SampleProgram sampleProgram = new SampleProgram();
        sampleProgram.method1("Hello this is shrrevishnu is this yes");
    }
}
