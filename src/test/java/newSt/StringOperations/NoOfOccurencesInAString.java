package newSt.StringOperations;

import java.util.HashMap;
import java.util.Map;

public class NoOfOccurencesInAString {

    public void charCount(String str){

        str = str.toLowerCase();

        char[] charArray = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(char charValue: charArray){
            if(charValue == ' '){
                continue;
            }
        if (map.containsKey(charValue))
        {
            map.put(charValue, map.get(charValue)+1);
        }
        else {
            map.put(charValue, 1);
        }
        }

        for (Map.Entry entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue()+" ");
        }
    }



    public static void main(String[] args) {

      //  extracted();
NoOfOccurencesInAString noOf = new NoOfOccurencesInAString();
noOf.charCount("Shrrevishnu A R");

    }

    private static void extracted() {
        String str = "Shrrevishnu A R";
        boolean flag = false;


        char charStr[] = str.toCharArray();

        for(int i= 0; i<charStr.length; i++){
            int count=1;

            for (int j=i+1; j<charStr.length; j++){

                if(charStr[i] == charStr[j]){

                    for(int k=j ; k>i; k--){
                        if(charStr[k-1] == charStr[i-1]){
                            flag = true;

                        }
                    }
                    if(flag == false) {
                        count++;
                    }


                }
            }

            if(flag == true)
            System.out.println("The character"+" "+charStr[i]+" was present"+count);
        }
    }


}
