
public class LEETCODE_326
{
	public static void main(String[] args)
	{
		int n=23;
		
		//Method-1
		
		if(n==0)
		{
			System.out.println(false);
		}
		
		while(n%3==0)
		{
			n/=3;
		}
		
		System.out.println(n==1);
		
		//Method-2
		
//		System.out.println(Math.log(n)/Math.log(3));
//		
//		int x = (int) Math.ceil(Math.log(n)/Math.log(3));
//		
//		System.out.println(x);
//		
//		System.out.println(Math.pow(3, x)==n);
	}
}
