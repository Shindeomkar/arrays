package arrays;

public class ReverseArray {
    static void reverse(int arr[],int n)
    {
        int temp=0,l,r;
        l=0;
        r=n-1;
        while(l<r)
        {
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,33,4,5};
        reverse(arr,5);
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
