package arrays;

public class IsSoreted {
    static boolean issorted(int arr[],int n)
    {
        if(arr[0]<arr[1])
            for (int i=0;i<n-1;i++)
            {
                if(arr[i]>arr[i+1])
                    return false;
            }
        else if(arr[0]>arr[1])
            for (int i=0;i<n-1;i++)
            {
                if(arr[i]<arr[i+1])
                    return false;
            }
        return true;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,40,30,50};
        if(issorted(arr,5))
            System.out.println("is sorted");
        else
            System.out.println("is not sorted");
    }
}
