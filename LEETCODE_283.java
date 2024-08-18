package basicSorting;

import java.util.ArrayList;
import java.util.List;

public class LEETCODE_283
{
    public static void main(String[] args)
    {
        int arr[] = {0,1,0,3,12};

        //Method-1
        int noz = 0;
        int n=arr.length;

        for(int ele:arr)
        {
            if(ele==0) noz++;
        }

        for(int x=0;x<n-1;x++)
        {
            for(int i=0;i<n-1-x;i++)
            {
                if(arr[i]==0)
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }

        for(int a:arr)
        {
            System.out.print(a+" ");
        }

        //Method-2
//        List<Integer> l = new ArrayList<>();
//
//        int c= 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if(a[i]!=0)
//            {
//                l.add(a[i]);
//            }
//
//            else c++;
//        }
//
//        for(int i=0;i<c;i++)
//        {
//            l.add(0);
//        }
//
//        System.out.println(l);
//
//        for(int i=0;i<a.length;i++)
//        {
//            a[i] = l.get(i);
//        }
    }
}
