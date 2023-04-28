package newSt.StringOperations;

public class ReplacingFewCharsInString {

    public void replaceCharsinString(String str, char wordtoRepolace, char newWord){

    str = str.toLowerCase();

        System.out.println(str.replace(wordtoRepolace, newWord));


    }

    public static void main(String[] args) {

        ReplacingFewCharsInString replacingFewCharsInString = new ReplacingFewCharsInString();
        replacingFewCharsInString.replaceCharsinString("This is a String", 'i','e');



    }

}
