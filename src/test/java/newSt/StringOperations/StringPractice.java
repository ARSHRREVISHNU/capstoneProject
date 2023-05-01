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

    public void swapFirstAndLastChars(String str){
        String[] strArray = str.split(" ");
        String newStr = "";
        for(int i=0; i<strArray.length; i++){
            char[] chArray = strArray[i].toCharArray();
            for(int j=0; j<chArray.length;j++){
                if(j==0){
                    newStr = newStr+ chArray[chArray.length-1];
                }
                else if(j==(chArray.length-1)){
                    newStr = newStr+chArray[0];
                }
                else if(j != 0 && j != (chArray.length-1))
                {
                    newStr = newStr+chArray[i];
                }

            }
            newStr = newStr+" ";
            //System.out.println(newStr);
        }
        System.out.println(newStr);
    }

    public void subStringPalindromeCheck(String str){
        str = str.toLowerCase();
        StringBuffer revStr;
        String tempStr = "";
        int count=0;
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length();j++){
                tempStr = str.substring(i,j);
                revStr = new StringBuffer(tempStr);
                revStr.reverse();
                if(tempStr.contentEquals(revStr)){
                    System.out.println("This sub string is a palindrome: "+tempStr);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public void subStringPalindromeCheck1(String str){

        str = str.toLowerCase();
        StringBuffer strRev;
        String temp="";
        int count =0;
        for(int i =0; i<str.length(); i++){
            for(int j=i+1; j<str.length();j++){

                temp = str.substring(i,j);
                strRev = new StringBuffer(temp);
                strRev.reverse();
                if(temp.contentEquals(strRev)){
                    System.out.println(temp);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public void theExpectedWordToBeRemoved(String str, String word){

        str = str.toLowerCase();

        String[] strArray = str.split(" ");

        Map<String, Integer> map = new HashMap();

        for(String strValue: strArray){
            if(map.containsKey(strValue)){
                map.put(strValue, map.get(strValue)+1);
            }
            else {
                map.put(strValue, 1);
            }
        }


        for(Map.Entry<String, Integer> entry: map.entrySet())
        {

            if((entry.getKey()).contentEquals(word)){
                System.out.println("The word "+entry.getKey()+"was present: "+entry.getValue());
            }
        }
    }

    public void swapFistAndLastWords(String str){

        str = str.toLowerCase();
        String[] strArr = str.split(" ");
        String newStr="";
        for(int i=0; i<strArr.length; i++){
            if(i==0){
                newStr = newStr+strArr[strArr.length-1]+" ";
            }
            else if(i==(strArr.length-1)){
                newStr = newStr+strArr[0];
            }
            else{
                    newStr = newStr+strArr[i]+" ";
            }
        }
        System.out.println(newStr);
    }


    public void matrixMultiplication(int[][] arr, int[][] arr2){
       int arr3[][] = new int [3][3];
       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr[0].length;j++){
               arr3[i][j] = 0;
               for(int k=0; k<arr[0].length; k++){
                   arr3[i][j] = arr[i][k] *arr2[k][j];
               }
               System.out.print(arr3[i][j]+" ");
           }
           System.out.println();
       }
    }


    public void getValuesFromUser(){

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        //List<Integer> list = new ArrayList<Integer>();

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        Iterator<Integer> iterator1 = list1.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        int a =0;
        for(int i=0; i<3; i++) {
            a = scanner.nextInt();
            //list.add(a);
            arr[i] = a;
        }
        //List list = Arrays.asList(arr);
        List<Integer> list2 = new ArrayList<Integer>();
        for(int value: arr){
            list2.add(value);
        }

        Iterator<Integer> iterator = list2.iterator();
        System.out.println(list2);
        for(int i=0; i<list2.size(); i++){
            System.out.println(list2.get(i));
        }
//        while(iterator.hasNext()){
//            System.out.println(iterator.next().toString());
//        }

    }
    public static void main(String[] args) {

        //int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] a = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] b = {{1,1,1},{2,2,2},{3,3,3}};

        StringPractice stringPractice = new StringPractice();
        //stringPractice.listOfOccurences("Shrrevishnu A R");
        //stringPractice.listOfOccurencesOfWord("value of value is value of the value");
        //stringPractice.occurencesOfAGivenWord("abc abdab acbag agab", "ab");
        //stringPractice.addingDiagonalMatrix(a);
        //stringPractice.addingReverseDiagonalMatrix(a);
        //stringPractice.transposeMatrix(a);
        //stringPractice.removeSpecificWord("value of value is value of the value", "value");
        //stringPractice.printUniquesWordsString("valuevjopa");
        //stringPractice.swapFirstAndLastChars("value of value is value of the value");
        //stringPractice.subStringPalindromeCheck("TENET");
        //stringPractice.subStringPalindromeCheck1("TENET");
        //stringPractice.theExpectedWordToBeRemoved("The value is of value","value");
        //stringPractice.swapFistAndLastWords("first of value is value of the last");
        //stringPractice.matrixMultiplication(a, b);
        stringPractice.getValuesFromUser();
    }




}
