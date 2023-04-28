package newSt.StringOperations;

import java.util.Arrays;

public class StringFunctionsPractice {

    public void stringFunction(){


        String str1 = "Maara is bad";
        String str2 = "bas id arMaa";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
            char[] strArray1 = str1.toCharArray();
            char[] strArray2 = str2.toCharArray();

            Arrays.sort(strArray1);
            Arrays.sort(strArray2);
            boolean equalOrnot = Arrays.equals(strArray1, strArray2);
        System.out.println(equalOrnot);


        //char word;

       // System.out.println(str1);
        
    }
    public static void main(String[] args) {
     StringFunctionsPractice stringFunctionsPractice = new StringFunctionsPractice();
     stringFunctionsPractice.stringFunction();
    }
}
