package newSt.StringOperations;

public class StringIsImmutable {

    public void immutableCheck(Object x, Object y){
        if(x==y){
            System.out.println("Both are referring to the same object");
        }
        else{
            System.out.println("Both are different");
        }


    }


    public static void main(String[] args) {

        String str1 = "Hi";
        String str2 = "Hi";

        StringIsImmutable immutable = new StringIsImmutable();
        immutable.immutableCheck(str1,str2);

        str1 += " Hello";
        immutable.immutableCheck(str1, str2);


    }

}
