package arrays;

public class LargestElement {
    static int largestElement(int arr[],int n)
    {
        int max=arr[0];
        for (int i=0;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,304,594};
        int max=largestElement(arr,4);
        System.out.println("largest element="+max);
    }
}
