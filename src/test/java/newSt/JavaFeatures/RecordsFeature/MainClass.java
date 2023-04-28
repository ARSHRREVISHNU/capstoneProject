package newSt.JavaFeatures.RecordsFeature;

public class MainClass {

    public static void main(String[] args) {

        RecordClass recordClass = new RecordClass("Name", 23);
        System.out.println(recordClass.age());
        System.out.println(recordClass.name());

    }

}
