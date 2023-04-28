package newSt.StringOperations;

public class SubstringPalindromeCheck {

    public void subStringGeneration(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <=str.length(); j++) {
                String subString = str.substring(i,j);
                    if(palindromeCheck(subString)){
                        System.out.println(subString);
                        count++;
                    }

            }


        }
        System.out.println("Total No of substrings: "+count);

    }


    public boolean palindromeCheck(String str){

        StringBuffer strBuffer = new StringBuffer(str);
        StringBuffer revStrBuffer = strBuffer.reverse();

        if(str.contentEquals(revStrBuffer.toString())){
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        SubstringPalindromeCheck substringPalindromeCheck = new SubstringPalindromeCheck();
        substringPalindromeCheck.subStringGeneration("TENET");
    }
}


