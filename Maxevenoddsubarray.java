package arrays;

public class Maxevenoddsubarray {
    static int maxLen(int arr[])
    {
        int res=1;int curr=1;
        for (int i=0;i< arr.length;i++) {
            curr = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 == 0 && arr[j - 1] % 2 == 0))
                    curr++;
                else
                    break;

            }
            res = Math.max(res, curr);
        }
        return res;

    }
    public static void main(String[] args) {
        int []arr={10,12,14,7,8};
        int res=maxLen(arr);
        System.out.println("len="+res);
    }
}
