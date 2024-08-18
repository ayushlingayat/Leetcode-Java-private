import java.util.Scanner;

public class Leetcode_204_Count_Primes
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int res= countPrimes(n);
		
		System.out.println(res);
	}
	
	public static int countPrimes(int n)
	{
		if(n<2)
			return 0;
		
		boolean isPrime[] = new boolean[n];
	
		int count=0;

		for(long i=2;i<=Math.sqrt(n);i++)
		{
			if(!isPrime[(int)i])
			{
				count++;
				for(long j=i*i;j<n;j+=i)
					isPrime[(int)j]=true;
			}
		}
		
		return count;
	}
}
