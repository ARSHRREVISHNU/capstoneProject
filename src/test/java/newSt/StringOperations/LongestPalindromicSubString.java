package newSt.StringOperations;

public class LongestPalindromicSubString {

    public String findPalindrome(String subStr){

        String revWord = "";
        for(int k=subStr.length()-1; k>=0; k--){
            revWord = revWord+subStr.charAt(k);
        }

        return revWord;
    }
    public void palindromicSubString(String str){

        String tempPalindrome = "";
        String longestPalindrome = "";
        String tempWord = "";
        str = str.toLowerCase();
        for (int i=0; i<str.length(); i++){
          tempWord = "";
            for (int j=i; j<str.length(); j++){

                tempWord = tempWord + str.charAt(j);

                if(tempWord.contentEquals(findPalindrome(tempWord))){
                    tempPalindrome = tempWord;
                }
            }

            if(tempPalindrome.length()>longestPalindrome.length()){

                longestPalindrome = tempPalindrome;
            }
        }

        //return longestPalindrome;
        System.out.println(longestPalindrome);
    }


    public static void main(String[] args){


        LongestPalindromicSubString longestPalindromicSubString = new LongestPalindromicSubString();
        longestPalindromicSubString.palindromicSubString("Leopoel");


    }
}
