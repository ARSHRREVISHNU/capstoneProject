package newSt.JavaFeatures;

public class MeaningfulNullPointerException {
    public void testMethod(){
        System.out.println("Hi this is a string.");
    }


    public static void main(String[] args) {

        MeaningfulNullPointerException meaningfulNullPointerException = null;

        meaningfulNullPointerException.testMethod();


    }




}
