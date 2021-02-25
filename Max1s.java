package arrays;

public class Max1s {
    static int max1s(int arr[])
    {
        int i=0,max=0,count=0;
        while(i< arr.length)
        {
            while(arr[i]==1)
            {
                count++;
                i++;
            }
            if(count>max)
                max=count;
            count=0;
            i++;
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr=new int[]{0,1,1,1,0,1,0};
        int result=max1s(arr);
        System.out.println("result="+result);
    }
}
