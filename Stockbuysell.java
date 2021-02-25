package arrays;
import java.util.*;

public class Stockbuysell {
    static void buySell(int arr[])
    {
        int i=0,j=1,total=0;
        while(i< arr.length&&j< arr.length)
        {
            while((j+1)< arr.length && (arr[j+1]>arr[j]))
            {j++;}
            total=total+((arr[i]-arr[j])*(-1));
            i=j+1;
            j=j+2;
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        int []arr=new int[]{1,5,3,1,2,8};
        buySell(arr);
    }
}
