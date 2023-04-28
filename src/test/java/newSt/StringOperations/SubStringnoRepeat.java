package newSt.StringOperations;

public class SubStringnoRepeat {
    public String subString(String word){
        String largestWord = "";
        String tempWord = "";
        for(int i=0; i<word.length(); i++) {
            String letter = ""+word.charAt(i);
            if(tempWord.contains(letter)){
                String strtArr[] = tempWord.split(letter);
                if(tempWord.length()-1 == tempWord.indexOf(word.charAt(i))){
                    tempWord = "" + word.charAt(i);
                }
                else {
                    tempWord = strtArr[1] + word.charAt(i);
                }
            }
            else{
                tempWord = tempWord+word.charAt(i);
            }

            if(tempWord.length()>largestWord.length()){
                largestWord = tempWord;
            }

        }


        return largestWord;
    }




    public static void main(String[] args) {

        SubStringnoRepeat subStringnoRepeat = new SubStringnoRepeat();
        System.out.println(subStringnoRepeat.subString("abbcdecghijkg"));
    }


}
