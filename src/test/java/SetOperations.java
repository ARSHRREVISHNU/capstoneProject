import java.util.HashSet;
import java.util.Iterator;

public class SetOperations {

    public void sets(){

        HashSet set = new HashSet<Integer>();

        HashSet set1 = new HashSet<Integer>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        set1.add(5);
        set1.addAll(set);
        set1.add(6);

        Iterator<Integer> iterator = set1.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
       long value =  set1.stream().count();
        System.out.println(value);
    }


    public static void main(String[] args) {
        SetOperations setOperations = new SetOperations();
        setOperations.sets();
    }
}
