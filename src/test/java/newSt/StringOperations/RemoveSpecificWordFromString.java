package newSt.StringOperations;

public class RemoveSpecificWordFromString {

    public void removeWord(String str, String wordToRemove){

        String strArray[] = str.split(" ");
        for (String word: strArray){

            if(!word.contentEquals(wordToRemove)){
                System.out.print(word+" ");
            }
        }


    }


    public static void main(String[] args) {


        RemoveSpecificWordFromString remove = new RemoveSpecificWordFromString();
        remove.removeWord("This is the String", "the");
    }



}
