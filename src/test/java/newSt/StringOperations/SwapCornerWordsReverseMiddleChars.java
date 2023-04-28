package newSt.StringOperations;



public class SwapCornerWordsReverseMiddleChars {

    public String reverseWords(String revstr){

        String rev ="";
        for (int i=revstr.length()-1;i>=0; i--){

            rev = rev + revstr.charAt(i);

        }

        return rev;
    }


    public void swapCoernerAndReverseMiddle(String str){

        String rev = "";
        String strArray[] = str.split(" ");

        for(int i= strArray.length-1; i>=0; i--){

            if(i==0 || i==strArray.length-1){
                rev = rev+ strArray[i] +" ";
            }

            else {

                        rev = rev+ reverseWords(strArray[i]) +" ";
            }

        }


        System.out.println(rev);


    }



    public static void main(String[] args) {


        SwapCornerWordsReverseMiddleChars swapCornerWordsReverseMiddleChars = new SwapCornerWordsReverseMiddleChars();
        swapCornerWordsReverseMiddleChars.swapCoernerAndReverseMiddle("Hi This is shrrevishnu from TestVagrant");
    }


}
