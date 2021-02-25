package arrays;
import java.util.*;

public class MoveZeroesToEnd {
  static  void move(int arr[])
    {
        int temp;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] != 0)
                    {
                        temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,3,0,4};
        move(arr);
        for(int i=0;i<6;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
