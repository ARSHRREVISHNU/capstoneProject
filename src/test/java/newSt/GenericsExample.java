package newSt;

import java.util.ArrayList;

class Container<T extends Number>{

    public void show(T value){
        System.out.println(value.getClass().getName());
    }

    public void demo(ArrayList<T> value){

        System.out.println(value.getClass().getName());
    }

}

        public class GenericsExample {

            public static void main(String[] args) {

                Container<Integer> container = new Container<>();
                container.show(10);
                //container.show();



            }

}
