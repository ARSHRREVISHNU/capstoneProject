package newSt.StringOperations;

import java.util.*;

public class StringPractice {


    public void listOfOccurences(String str){

        str = str.toLowerCase();

        char[] ch = str.toCharArray();

        HashMap<Character, Integer>  map = new HashMap();

        for(Character ch1: ch)
        {
            if(!ch1.equals(' ')) {
                if (map.containsKey(ch1)) {
                    map.put(ch1, map.get(ch1) + 1);
                } else {
                    map.put(ch1, 1);
                }
            }
        }


        for(Map.Entry<Character, Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public void listOfOccurencesOfWord(String str){

        str = str.toLowerCase();
        String[] strArr = str.split(" ");
        Map<String, Integer> map = new HashMap();
        for(String str1: strArr){
            if(map.containsKey(str1)){
                map.put(str1, map.get(str1)+1);
            }
            else
            {
                map.put(str1, 1);
            }
        }

        for(Map.Entry<String, Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public void occurencesOfAGivenWord(String str, String word){
        str = str.toLowerCase();
        int count=0;
        String tempword="";
        for(int i =0; i<str.length()-1; i++){
            tempword = str.charAt(i)+""+str.charAt(i+1);
            if(tempword.contentEquals(word)){
                System.out.println("The word is"+tempword);
                count++;
            }
        }
        System.out.println(count);
    }


    public void addingDiagonalMatrix(int a[][]){
        int sum=0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(i==j){
                    sum = sum+a[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public void addingReverseDiagonalMatrix(int a[][]){

        int sum=0;

        for(int i=0; i<a.length; i++){
            for(int j=a.length; j>=0; j--){

                if(i==(j-1)){

                    sum = sum+a[i][j-1];

                }

            }

        }

        System.out.println(sum);
    }


    public void transposeMatrix(int a[][]){


        int[][] transpose= new int[3][3];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){

                transpose[i][j] = a[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void anaCheck(String str1, String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] ch = str1.toCharArray();
        char[]  ch2 = str2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);


        boolean check = Arrays.equals(ch, ch2);
        System.out.println(check);

    }

    public void removeSpecificWord(String str, String word){

        str = str.toLowerCase();
        word = word.toLowerCase();
        String[] strArr = str.split(" ");
        for(String value: strArr){

            if(!value.contentEquals(word)){
                System.out.print(value+" ");
            }
        }



    }


    public void printUniquesWordsString(String str){

            str = str.toLowerCase();
            char[] chArray = str.toCharArray();

            Map<Character, Integer> map = new HashMap();
            for(char ch : chArray){
                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch)+1);
                }
                else {
                    map.put(ch, 1);
                }
            }

            for(Map.Entry<Character,Integer> entry: map.entrySet()){
                if(entry.getValue() ==1){
                    System.out.println(entry.getKey());
                }
            }


    }
    public static void main(String[] args) {

        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

        StringPractice stringPractice = new StringPractice();
        //stringPractice.listOfOccurences("Shrrevishnu A R");
        //stringPractice.listOfOccurencesOfWord("value of value is value of the value");
        //stringPractice.occurencesOfAGivenWord("abc abdab acbag agab", "ab");
        //stringPractice.addingDiagonalMatrix(a);
        //stringPractice.addingReverseDiagonalMatrix(a);
        //stringPractice.transposeMatrix(a);
        //stringPractice.removeSpecificWord("value of value is value of the value", "value");
        stringPractice.printUniquesWordsString("valuevjopa");
    }




}
