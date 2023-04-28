package newSt;

import java.util.Arrays;

public class AnagramCheck {

    public void anagramCheck(String strOne, String strTwo){

       strOne = strOne.toLowerCase();
       strTwo = strTwo.toLowerCase();

       char ch[] = strOne.toCharArray();
       char ch2[] = strTwo.toCharArray();

       if(ch.length == ch2.length) {
           Arrays.sort(ch);
           Arrays.sort(ch2);
           boolean anaCheck = Arrays.equals(ch, ch2);
           if(anaCheck){
               System.out.println("The strings are anagram");
           }
           else{
               System.out.println("The strings are not anagram");
           }
       }
       else {
           System.out.println("lengths of both strings should be same");
       }
    }





    public static void main(String[] args) {

        String str1 = "Hello this is shrrevishnu";
        String str2 = "Shrrevishnu this is hello";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char char1[] = str1.toCharArray();
        char char2[] = str2.toCharArray();

        if(char1.length == char2.length){
            Arrays.sort(char1);
            Arrays.sort(char2);
           boolean anaOrNot =  Arrays.equals(char1,char2);
            System.out.println(anaOrNot);
        }
        else{
            System.out.println("The lengths was not equal");
        }

    }

}
