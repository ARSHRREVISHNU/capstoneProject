package newSt.JavaFeatures;

public class Switchexample {

    public static void main(String[] args) {

        switch("value 2"){
            case "value 1", "value 3", "value 5" -> System.out.println("Odd values");
            case "value 2", "value 4", "value 6" -> System.out.println("Even values");
            case "value 0" -> System.out.println("0 Value");
            default -> System.out.println("Something different");
        }



    }


}
