import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {
    public static void main(String[] args)
    {
        /*Predicate<String> p=n->n.length()>9;
        Function<String,Integer> f=str-> str.length();
        System.out.println(f.apply("krishna"));
        Consumer<String> con=string-> System.out.println("hello"+" "+string);
        con.accept("Krishna");
        con.accept("Tiwari");
        Supplier<Date> date=()->new Date();
        System.out.println(date.get());*/

       /* Consumer<String> cons= (s)-> System.out.println("this is consumer"+s);
        cons.accept("demo");
        Predicate<Integer> p2=(i)-> i>5;
        System.out.println(p2.test(9));
        Supplier<Date> s3=()->new Date();
        System.out.println(s3.get());
        Function<String,Integer> f4=(s)-> {
            if(s.length()>10)
            return s.length();
            else return 90;
        };
        int len=f4.apply("krishna Tiwari");
        System.out.println(len);*/

        Supplier<emp> e1=()->new emp(34,"krishna");
        emp obj=e1.get();
        System.out.println(obj.empid);

    }
}

class emp{
    int empid;
    String empName;

    emp(int empid,String empName){
        this.empid=empid;
        this.empName=empName;

    }
}


/*Lambda expressions in java8

        1. Function
        2. Predicate
        3. Supplier
        4. Consumer
these are inbuild functinal  interface in java.*/
