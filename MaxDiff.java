package arrays;

public class MaxDiff {
    static int maxDiff(int arr[])
    {
        int max=0;
        for (int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[j]-arr[i]>max)
                    max=(arr[j]-arr[i]);
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,10,6,4,8,1};
        int result=maxDiff(arr);
        System.out.println("max difference is="+result);
    }
}
