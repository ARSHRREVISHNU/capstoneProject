package newSt.Java_Reflection;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassB {

    public static void main(String args[]) throws InvocationTargetException, IllegalAccessException {

        ClassA classA = new ClassA("Vishnu", "25");

        System.out.println( classA.getAge());
        System.out.println(classA.getName());
        classA.setAge("30");
        System.out.println(classA.getAge());

        System.out.println("Declared Fields");
        Field[] fields = classA.getClass().getDeclaredFields();
        for(Field field: fields){
            System.out.println(field.getName());
        }

        System.out.println("Set value for name");

        for (Field field: fields)
        {
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(classA, "Shrrevishnu");
                System.out.println(classA.getName());
            }
        }

        System.out.println("Declared methods");
        Method[] methods = classA.getClass().getDeclaredMethods();
        for(Method method: methods){
            System.out.println(method.getName());
        }

        for(Method method: methods){

            if(method.getName().equals("methodTwo")){
               method.setAccessible(true);
                method.invoke(classA);
            }
        }
    }

}
