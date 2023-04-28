package newSt.StringOperations;

public class FindOccurencesInAString {
//
//    str1="abcd abab cacab"
//    str2 = "ab"
        public void findOccurence(String str, String word){
            int count =0;
            for(int i=0; i<str.length()-1; i++){

                String tempWord = str.charAt(i)+""+str.charAt(i+1)+"";
                if(tempWord.contentEquals(word)){
                    count++;
                }
                System.out.println(tempWord);
            }
            System.out.println(count);
        }


    public static void main(String[] args) {
        FindOccurencesInAString findOccurencesInAString = new FindOccurencesInAString();
        findOccurencesInAString.findOccurence("abcd abab cacab", "ab");
    }
}
