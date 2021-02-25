package arrays;

public class MaxSubarray {
    static int maxSum(int arr[])
    {
        int max=0,sum=0;
        for (int i=0;i< arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
                sum=sum+arr[j];
            if (sum>max)
                max=sum;

            sum=0;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, -8, 7, -1, 2, 3};
        int result = maxSum(arr);
        System.out.println("sum=" + result);
    }
}
