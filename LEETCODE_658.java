package BinarySearch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LEETCODE_658
{
    public static void main(String[] args)
    {
        int a[]={1};

        int k=1,x=1;

        List<Integer> res = findClosestElements(a,k,x);

        System.out.println(res);
    }

    public static List<Integer> findClosestElements(int[] a, int k, int x)
    {
        List<Integer> l=new ArrayList<>();

        int n=a.length;

         if(x<a[0])
         {
             for(int i=0;i<k;i++)
             {
                 l.add(a[i]);
             }

             return l;
         }

         else if(x>a[n-1])
         {
             for(int i=n-k;i<n;i++)
             {
                 l.add(a[i]);
             }

             return l;
         }

         int lb=n;

         int lo=0,hi=n-1;

         while(lo<=hi)
         {
             int mid=lo+(hi-lo)/2;

             if(a[mid]>=x)
             {
                 lb=mid;
                 hi=mid-1;
             }

             else lo=mid+1;
         }

         int j=lb,i=lb-1;

         while(k>0 && i>=0 && j<n)
         {
             int di = Math.abs(x-a[i]);
             int dj = Math.abs(x-a[j]);

             if(di<=dj)
             {
                 l.add(a[i]);
                 i--;
             }

             else
             {
                 l.add(a[j]);
                 j++;
             }

             k--;
         }

         while(i<0 && k>0)
         {
             l.add(a[j]);
             j++;
             k--;
         }

         while(j==n && k>0)
         {
             l.add(a[i]);
             i--;
             k--;
         }

        Collections.sort(l);

        return l;
    }
}
