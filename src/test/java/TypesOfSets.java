import  java.util.*;

public class TypesOfSets {

    public void sets(){

        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(6);
        set.add(7);
        set.add(3);


        System.out.println("Set Operations");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());


        //linkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Men");
        linkedHashSet.add("Women");
        linkedHashSet.add("Animal");
        linkedHashSet.add("Child");
        linkedHashSet.add("bABY");
        linkedHashSet.add("Child");


        System.out.println("linked hashSet");
        Iterator<String> iterator1 = linkedHashSet.iterator();

        while (iterator1.hasNext())
            System.out.println(iterator1.next());

        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(3);

        System.out.println("Tree Set");
        Iterator<Integer> iterator2 = treeSet.iterator();
        while (iterator2.hasNext())
            System.out.println(iterator2.next());




    }



    public static void main(String[] args) {
        TypesOfSets typesOfSets = new TypesOfSets();
        typesOfSets.sets();
    }
}
