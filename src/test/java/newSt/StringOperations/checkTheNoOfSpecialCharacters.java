package newSt.StringOperations;

public class checkTheNoOfSpecialCharacters {

    public void specialCharactersCheck(String str){

        int count =0;
        char strArray[] = str.toCharArray();

        for (int i=0; i<strArray.length; i++){

            if(!Character.isLetterOrDigit(strArray[i]) && !Character.isWhitespace(strArray[i])){

                System.out.println(strArray[i]);

                    count++;
            }



        }
        if(count == 0){
            System.out.println("no special chars was present");
        }
        else {

            System.out.println("The no of special chars present: "+count);
        }


    }



    public static void main(String[] args) {


        checkTheNoOfSpecialCharacters checkTheNoOfSpecialCharacters = new checkTheNoOfSpecialCharacters();
        checkTheNoOfSpecialCharacters.specialCharactersCheck("!$shr$ 678k$kh ^&kkljlj^#$hk");
    }
}
