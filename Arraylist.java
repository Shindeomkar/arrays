package arrays;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
       String sarr[]={"omkar","neha","vvv"};
        List<String> list=Arrays.asList(sarr);
        ArrayList<String> c=new ArrayList<String>(list);
        System.out.println(c);

    ArrayList<Integer> i1=new ArrayList<Integer>(10);
    i1.add(10);
    i1.add(20);
    i1.add(30);
    }
}
