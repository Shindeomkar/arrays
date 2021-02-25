package arrays;

public class FrequenciesInArray {
    static void frequencies(int arr[])
    {
        int freq=1;
        int i=1;
        while(i< arr.length)
        {
            while(i< arr.length && arr[i]==arr[i-1])
            {
                freq++;
                i++;
            }
            System.out.println("freq of "+arr[i-1]+" is "+freq);
            i++;
            freq=1;
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{10,10,10,20,30,30,30};
        frequencies(arr);
    }
}
