package newSt.Java_Reflection;

public class ClassA {


    private final String name;
    private String age;

    public ClassA(String name, String age){
            this.name = name;
            this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setAge(String age){
        //return age;
        this.age = age;
    }

    public String getAge(){
        return age;
    }

    public static void methodOne(){
        System.out.println("Public static void: Method One ");
    }

    private static void methodTwo(){
        System.out.println("Private static void: Method Two ");
    }

}
