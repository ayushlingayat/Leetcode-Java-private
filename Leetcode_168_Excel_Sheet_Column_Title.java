import java.util.Scanner;

public class Leetcode_168_Excel_Sheet_Column_Title
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		int columnNumber = sc.nextInt();
		
		String res = convertToTitle(columnNumber);
		
		System.out.println(res);
	}
	
	public static String convertToTitle(int columnNumber)
	{
		String res = "",res1="";
		int n = columnNumber, n1=0, n2=0;
				
		if(columnNumber<=26)
		{
			res += (char)(64+columnNumber);
		}
		
		else
		{
			while(n>0)
			{
				if(n%26==0)
				{
					res += (char)(64+26);
					
					n-=26;
					
					n1=n;
					n2=n;
					while(n2>0)
					{
						if((n1/26) > 26)
						{
							n=n/26;
							res += (char)(64+(n));
						}
						
						n1=n;
						n2/=26;
					}
				}
				
				else
					res += (char)(64+(n%26));
				
				n/=26;
			}
			
			for(int i=res.length()-1;i>=0;i--)
				res1+=res.charAt(i);
			
			return res1;
		}
						
		return res;
	}
}
