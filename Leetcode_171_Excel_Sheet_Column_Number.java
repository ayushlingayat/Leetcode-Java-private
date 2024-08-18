import java.util.Scanner;

public class Leetcode_171_Excel_Sheet_Column_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String columnTitle =sc.next();
		
		int res = titleToNumber(columnTitle);
		
		System.out.println(res);
	}
	
	public static int titleToNumber(String columnTitle)
	{
		if(columnTitle.length()==1)
		{
			return columnTitle.charAt(0)-64;
		}
		
		else
		{
			char t[]= columnTitle.toCharArray();
			
			int num=0,p=t.length-1;
			
			for(int i=0;i<t.length && p>=0;i++)
				num+=(t[i]-64)*(Math.pow(26,p--));
			
			return num;
		}		
	}
}
