import java.util.HashSet;
import java.util.Scanner;

public class Leetcode_1539_Kth_Missing_Positive_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int arr[] = {2,3,4,7,11};
		
		int k= sc.nextInt();
		
		int res= findKthPositive(arr,k);
		
		System.out.println(res);

	}
	
	public static int findKthPositive(int arr[],int k)
	{
		int temp[] = new int[k];
		int j=0;
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(int i:arr)
			h.add(i);
		
		int count = 0;
		
		for(int i=1;i<=(arr.length+k) && count<k;i++)
		{
			if(!h.contains(i))
			{
				temp[j++]=i;
				count++;
			}
		}		
		
		return temp[count-1];
	}

}
