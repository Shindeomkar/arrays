package arrays;

public class LeadersInArray {
    static void leaders(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            boolean flag=false;
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>=arr[i])
                    flag=true;
            }
            if(flag==false)
                System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{7,10,4,3,6,5,2};
        leaders(arr);

    }

}
