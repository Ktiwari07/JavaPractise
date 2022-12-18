import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList();
        list.add("krishna");
        list.add(1,"tiwari");
        list.add("manmohan");
        list.add(String.valueOf(12));
        System.out.println(list);
        //iterate the arraylist
         for(int i=0;i<list.size();i++){
             System.out.println(list.get(i));
         }
         //second method
        System.out.println("retrieve element using foreach loop");
        for(String i: list){
            System.out.println(i);
        }
        Iterator itr=list.iterator();
        System.out.println("retreiving element using iterator");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //sorting elemtns
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println();
//convert a simple array to arraylist
        String[] arr={"this","is","krishna","Tiwari"};
        ArrayList l=  (ArrayList)Arrays.asList(arr);
        System.out.println(l);
    }





}
