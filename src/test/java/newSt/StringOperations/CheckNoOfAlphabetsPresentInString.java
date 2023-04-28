package newSt.StringOperations;

public class CheckNoOfAlphabetsPresentInString {


    public void wordsCheck(String str) {

        int count = 0;
        char strArray[] = str.toCharArray();

        for (int i = 0; i < strArray.length; i++) {
            if (Character.isLetter(strArray[i])) {

                count++;
                System.out.println(" "+strArray[i]);
            }


        }
if(count == 0){
    System.out.println("no chars was present");
}
else {
    System.out.println("The no chars present was: " +count);
}
    }
    public static void main(String[] args) {
        CheckNoOfAlphabetsPresentInString checkNoOfAlphabetsPresentInString = new CheckNoOfAlphabetsPresentInString();
        checkNoOfAlphabetsPresentInString.wordsCheck("!$shr$ 678k$kh ^&kkljlj^#$hk");
    }
}
