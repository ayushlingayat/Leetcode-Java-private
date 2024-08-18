import java.util.Scanner;

public class Leetcode_67_Add_Binary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		String res= addBinary(a,b);
		
		System.out.println();
		
		System.out.println(res);
	}
	
	public static String addBinary(String a, String b)
	{
		int x = a.length()>b.length() ? a.length() : b.length();
		
		char a1[]= new char[x+1];
		
		int j = a.length()-1;
		
		for(int i=a1.length-1;i>0;i--)
		{
			if(j<0)
				break;
			
			a1[i]=a.charAt(j--);
		}
		
		char b1[]= new char[x+1];
		
		int k = b.length()-1;
		
		for(int i=b1.length-1;i>0;i--)
		{
			if(k<0)
				break;
			
			b1[i]=b.charAt(k--);
		}
		
		for(int i=0;i<a1.length;i++)
		{
			if((int)(a1[i])==0)
				a1[i]='0';
			
			if((int)(b1[i])==0)
				b1[i]='0';
		}
			
		for(char i:a1)
			System.out.print(i+" ");
				
		System.out.println();
				
		for(char i:b1)
			System.out.print(i+" ");
		
		char c[]= new char[x+1];
		
		boolean isCarry = false;
		
		for(int i=c.length-1;i>=0;i--)
		{
			if((a1[i]=='0' && b1[i]=='1') || (a1[i]=='1' && b1[i]=='0'))
			{
				if(isCarry)
				{
					c[i] = '0';		
				}
				
				else
				{
					c[i] = '1';
				}
					
			}
			
			else if(a1[i]=='1' && b1[i]=='1')
			{
				if(i==c.length-1 )
				{
					c[i]= '0';
					isCarry = true;
				}
				
				else
				{
					if(!isCarry)
					{
						c[i]= '0';
						isCarry = true;
					}
					
					else
					{
						c[i]= '1';
						isCarry = true;
					}
				}
			}
			
			else if(a1[i]=='0' && b1[i]=='0')
			{
				if(isCarry)
				{
					c[i]= '1';
					isCarry = false;
				}
				
				else
				{
					c[i]= '0';
				}
			}
		}
		
		
		System.out.println();
		
		for(char i:c)
			System.out.print(i+" ");		
		
		if(c[0]=='0')
		{
			String z = "";
			
			for(int i=1;i<c.length;i++)
				z+=c[i];
			
			return z;
			
		}		
		
		return new String(c);
	}
}
