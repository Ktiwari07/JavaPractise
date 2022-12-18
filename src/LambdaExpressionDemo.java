import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExpressionDemo {

    public static void main(String[] args) {
        Predicate<Integer> p=i->i>90;
        System.out.println(p.test(90)) ;
        Employee e1=new Employee("krishna",10000,"Nainital");
        Predicate<Employee> pp=e->e.salary>6000;
        System.out.println(pp.test(e1));
        // your own lambda expressions.
        A a=()-> System.out.println("message");
        a.display();
        //some kind of operations then use Function lambda expressions
        Function<Integer,Integer> f= i->{
            System.out.println("hell");
            return i*i;
        };
        System.out.println(f.apply(89));
        //find string length of a string.
        String str="This is lambda expression demo";
        Function<String,Integer> func=string->str.length();
        System.out.println("the lenght of the string is "+func.apply(str));
    }
}
class Employee{
    String name;
    int salary;
    String address;
    Employee(String name,int salary,String address){
        this.name=name;
        this.salary=salary;
        this.address=address;
    }
}
@FunctionalInterface
interface A{
    public void display();
}


//we have 4 types of functional interfaces in java8
//1. we have Predicate which is having test() as an abstract method.
//2. we have Function functional interface which is having apply() as an abstarct method. Function<T,R>
//2. then we have Consumer as a functional interface which is not having anything.
//3. Then we have Supplier which is having supply as a functional.