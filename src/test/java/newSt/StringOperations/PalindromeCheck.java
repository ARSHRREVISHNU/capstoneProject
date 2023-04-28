package newSt.StringOperations;

public class PalindromeCheck {


    public String stringRevWithoutMethods(String str){

        str = str.toLowerCase();
        int strLen =   str.length();
        String revStr = "";


        for(int i=strLen-1; i>=0; i--)
        {

            revStr = revStr + str.charAt(i);
        }

        System.out.println(revStr);
        return revStr;
    }


    public void palindromeCheck(String str){

        str = str.toLowerCase();
        if(str.contentEquals(stringRevWithoutMethods(str))){
            System.out.println("Given String is palindrome.");
        }
        else {
            System.out.println("Given String is not a plaindrome.");
        }

    }
    public static void main(String[] args) {
        PalindromeCheck palindromeCheck = new PalindromeCheck();
        palindromeCheck.palindromeCheck("Malayalam");
    }
}
