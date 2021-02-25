package arrays;

public class RemoveDuplicateFromSortedArray {
    static int removeDuplicate(int arr[])
    {
        int n= arr.length;
        int temp[]=new int[n];
        int res=1;
        temp[0]=arr[0];
        for (int i=1;i<n;i++) {
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }
        for(int i=0;i<res;i++)
            arr[i]=temp[i];
        return res;

    }
    public static void main(String[] args) {
        int arr[]={10,20,30,30,30,40};
        int res=removeDuplicate(arr);
        for (int i=0;i<res;i++)
            System.out.println(arr[i]);
    }
}
