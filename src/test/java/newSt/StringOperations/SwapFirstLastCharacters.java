package newSt.StringOperations;

public class SwapFirstLastCharacters {
    public void swapFirstLastCharacters(){
        String str = "Geeks For Geeks";

        String strArray[] = str.split(" ");
        //char[] strArray = str.toCharArray();
        //System.out.println(strArray[]);

     //   System.out.println(strArray[1]);

        String  newWord = "";

        for (int i=0; i<strArray.length; i++){


            char[] chars = strArray[i].toCharArray();

            for (int j =0; j<chars.length; j++) {
                if(j == 0){
                    newWord = newWord +chars[chars.length-1];
                }
                else if(j !=0 && j != (chars.length -1)) {
                    newWord = newWord + chars[j];
                }
                else if(j == (chars.length -1)){
                newWord = newWord + chars[0];
                }
            }

        newWord = newWord + " ";
        }
        System.out.println(newWord);
    }

    public static void main(String[] args) {
        SwapFirstLastCharacters swapFirstLastCharacters1 = new SwapFirstLastCharacters();
        swapFirstLastCharacters1.swapFirstLastCharacters();
    }
}
