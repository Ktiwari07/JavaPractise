import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Hashtable<Integer, String> t = new Hashtable();
        t.put(43, "krishna");
        t.put(12, "mannu");
        t.put(34, "bannu");
        t.put(89, "kannu");
        //t.put(null,"krishna");


        System.out.println(t.get(43));

        t.remove(34);
        System.out.println(t);

        System.out.println(t.containsKey(89));
        System.out.println(t.contains("mannu"));
        System.out.println(t.containsValue("bannu"));
        System.out.println(t.isEmpty());

        System.out.println(t.keySet());//return values as a set object.
        System.out.println(t.values());// as a collection object

        for (int k : t.keySet()) {
            System.out.println(k + "" + t.get(k));
        }

        //entry specific methods.....

        for (Map.Entry entry : t.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Set ss=t.entrySet();
        Iterator itr=ss.iterator();
    }
}