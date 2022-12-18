import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamsDemo {
    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        ArrayList<String> l1=new ArrayList<String>();
        l.add("Krishna");l.add("Tiwari");l.add("Manmohan");
        l1= (ArrayList<String>) l.stream().filter(s->s.length()<=6).collect(Collectors.toList());
        System.out.println(l1);
        //Another example
        List<String> l2= Arrays.asList("krishna",null,"tiwari",null);
        List<String> l3=new ArrayList<>();
        l3=l2.stream().filter(w->w!=null).collect(Collectors.toList());
        System.out.println(l3);
        List<Integer> intList=new ArrayList<Integer>();
        intList.add(98);intList.add(8);intList.add(11);intList.add(9);
        List<Integer> newlist=intList.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(newlist);
        List<String> strlist=new ArrayList<>();
        strlist.add("krishna");
        strlist.add("Manmohan");
        strlist.add("tiwari");
        strlist.add("Kabbu");
        List<String> upppercaseList=strlist.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(upppercaseList);
    }
}

