import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Leetcode_989_Add_to_Array_Form_of_Integer 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int num[] = {9,9,9,9,9,9,9,9,9,9};
		
		int k = sc.nextInt();
		
		List<Integer> res= addToArrayForm(num,k);
		
		System.out.println(res);
	}
	
	public static List<Integer> addToArrayForm(int num[], int k)
	{
		List<Integer> l = new ArrayList<Integer>();
		
		String z = Arrays.toString(num);
		String t = "";
		String temp ="";
		
		for(int i=0;i<z.length();i++)
		{
			if(z.charAt(i)!= ']' && z.charAt(i)!='[' && z.charAt(i)!=',' && z.charAt(i)!=(char)(32))
				t+=z.charAt(i);
		}
		
		BigInteger k1=BigInteger.valueOf(k);
		
		BigInteger sum = k1.add(new BigInteger(t));
		
		System.out.println(sum);
		
		while(sum.compareTo(BigInteger.ZERO) > 0)
		{
			BigInteger p = (sum.mod(BigInteger.TEN));
			temp+=p;
			sum = sum.divide(BigInteger.TEN);
		}
		
		for(int i=temp.length()-1;i>=0;i--)
			l.add((int)(temp.charAt(i))-48);
		
		return l;
	}

}
