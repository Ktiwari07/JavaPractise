import java.util.ArrayList;
import java.util.List;
public class FilterDemo {
    public static void main(String[] args) {
        List<Product> prodList=new ArrayList<>();
        prodList.add(new Product(1,"laptop",78990));
        prodList.add(new Product(2,"HP laptop",128990));
        prodList.add(new Product(3,"MacBook",278990));
        prodList.add(new Product(4,"HeadPhone",25000));
        prodList.add(new Product(5,"Jabra",56200));
        prodList.stream().filter(p->p.prodPrice>50000).forEach(p-> System.out.println(p.prodId));
        }
}
class Product{
    int prodId;
    String prodName;
    int prodPrice;
    public Product(int prodId,String prodName,int prodPrice){
        this.prodId=prodId;
        this.prodName=prodName;
        this.prodPrice=prodPrice;
    }
}