public class CustomArrayList {


    private static int size=10;
    int []arr;
    int numofelement=0;

    public CustomArrayList(int size){
        this.size=size;
        arr=new int[size];
    }

    public void add(int item){


        if(isFull()){
            size=size*2;
            int []temp=new int[size];
            for(int i=0;i<numofelement;i++){
                temp[i]=arr[i];
            }
            arr=temp;

        }
        arr[numofelement++]=item;
    }

    public boolean isFull(){
        if(arr.length==numofelement){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList(2);
        list.add(89);
        list.add(8);
        list.add(1);
        list.add(32);
        list.add(311);
        for(int j=0;j<size;j++){
            System.out.println(list.arr[j]);
        }

    }





}
