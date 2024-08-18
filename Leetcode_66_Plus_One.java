import java.math.BigInteger;
import java.util.Arrays;

public class Leetcode_66_Plus_One {
	public static void main(String[] args) {
		int digits[] = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};

		int res[] = plusOne(digits);

		for (int i : res)
			System.out.print(i + " ");
	}

	public static int[] plusOne(int digits[])
	{
		String s= Arrays.toString(digits);
		
		String s1 = "";
		String s2 ="1";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)		
				s1+=s.charAt(i);
		}
		
		BigInteger b= new BigInteger(s2);
		BigInteger a= new BigInteger(s1);
		
		a = a.add(b);
		
		String s3=a.toString();
		
		int nums[] = new int[s3.length()];
		
		for(int i=0;i<s3.length();i++)
		{
			nums[i]= s3.charAt(i)-48;
		}
		
		return nums;
	}
}
