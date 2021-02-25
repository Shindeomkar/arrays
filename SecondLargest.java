package arrays;

public class SecondLargest {
        static int secondLargestElement(int arr[],int n)
        {
            int max=arr[0],secondmax=0;
            for (int i=0;i<n;i++)
            {
                if(arr[i]>max)
                { max=arr[i];}
                else if((arr[i]>secondmax)&&(arr[i]<max))
                {secondmax=arr[i];}
            }
            return secondmax;
        }
        public static void main(String[] args) {
            int arr[]=new int[]{10,1004,20,304,594};
            int max=secondLargestElement(arr,5);
            System.out.println("second largest element="+max);
        }
    }


