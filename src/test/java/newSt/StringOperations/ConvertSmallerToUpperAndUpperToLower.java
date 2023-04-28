package newSt.StringOperations;

public class ConvertSmallerToUpperAndUpperToLower {




    public void stringRevAndSmallerToUpperAndUpperToLower(String str){

     String revstr = "";
     char ch;

     for(int i = str.length()-1; i>=0; i--){

         ch = str.charAt(i);
         if(Character.isLowerCase(ch)){
            ch = Character.toUpperCase(ch);
         }
         else if(Character.isUpperCase(ch)){
             ch = Character.toLowerCase(ch);
         }

         revstr = revstr +ch;

     }

        System.out.println(revstr);
    }

    public static void main(String args[]){
        ConvertSmallerToUpperAndUpperToLower convertSmallerToUpperAndUpperToLower = new ConvertSmallerToUpperAndUpperToLower();
        convertSmallerToUpperAndUpperToLower.stringRevAndSmallerToUpperAndUpperToLower("Shrrevishnu A R");
    }

}
