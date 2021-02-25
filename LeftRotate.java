package arrays;
import java.util.*;
public class LeftRotate {
    static void leftRotate(int arr[],int n,int d)
    {
        int temp[]=new int[n];
        for (int i=d;i<n;i++)
            temp[i-d]=arr[i];
        for (int i=n-d;i<n;i++)
            temp[i]=arr[i-(n-d)];
        for (int i=0;i<n;i++)
        {
            arr[i]=temp[i];
        }
    }

    public static void main(String[] args) {


        int[] arr = new int[]{30, 20, 15, 4, 2, 1};
        System.out.println("enter the no of positions you want to shift");
        Scanner sc=new Scanner(System.in);
        int d= sc.nextInt();
        leftRotate(arr,6,d);
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }
    }
}
