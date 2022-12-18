import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> set=new HashSet<String>();
        List<String> list=new ArrayList<String>();
        list.add("hello");
        list.add("ji");
        set.add("krishna");
        set.add("monu");
        set.add("Tiwari");
        System.out.println("set contains"+set);
        set.add("krishna"); //its a duplicate wont give error, but krishna will be only once
        set.add(null);
        System.out.println(set.addAll(list));
        System.out.println(set);
        List<String> l1= new ArrayList(set);
        System.out.println(l1);
        l1.add("ji");l1.add("krishna");l1.add(null);
        System.out.println(l1);
        System.out.println(new ArrayList(set));
    }
}
