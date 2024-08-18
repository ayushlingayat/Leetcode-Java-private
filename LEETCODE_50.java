public class q50_pow_x_n 
{
	public static void main(String[] args) 
	{
		double x=0.00001;
		int n=2147483647;
		
		System.out.println(myPow(x,n));		
	}
	
	public static double myPow(double x, int n) 
	{
			long nm = n;
			
			if(n<0)
			{
			   nm = -nm;
			   x = 1/x;
			}
		
	        return pow(x,nm);
	 }
	 
	 public static double pow(double x, long n)
	 {
	        if(n==0)
	            return 1;
				
	        if(n%2==0)
	            return pow(x*x, n/2);
	 
	        else
	            return x*pow(x,n-1);
	 }
}
