package basicSorting;

import java.util.HashMap;

public class LEETCODE_169
{
    public static void main(String[] args)
    {
        int a[]= {3,2,3};

        int res = majorityElement(a);

        System.out.println(res);
    }

    public static int majorityElement(int[] nums)
    {
        HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();

        int n= nums.length/2;

        for(int i:nums)
        {
            if(!h.containsKey(i))
                h.put(i,1);

            else
                h.put(i,h.get(i)+1);
        }

        System.out.println(h);

        for(int i:nums)
        {
            if(h.get(i)>n)
                return i;
        }

        return -1;
    }

    public static int majorityElement1(int[] arr)
    {
        //Method-1
//        Arrays.sort(arr);


        //Method-2
        for (int i=1;i<arr.length;i++)
        {
            for (int j=i;j>=1 && arr[j]<arr[j-1];j--)
            {
                swap(arr,j,j-1);
            }
        }

        return arr[arr.length/2];
    }

    public static void swap(int arr[], int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
