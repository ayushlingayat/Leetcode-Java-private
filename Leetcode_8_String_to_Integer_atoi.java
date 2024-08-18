import java.util.Scanner;

public class Leetcode_8_String_to_Integer_atoi 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String s= sc.nextLine();
		
		System.out.println(myAtoi(s));
	}
	
	public static int myAtoi(String s) 
    {
		s=s.trim();
		        
        if(s.length()==0) 
            return 0;
        
        int sign = +1;
        long ans = 0;
        
        if(s.charAt(0) == '-') 
            sign = -1;
        
        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;
		
		// initiate the starting pointer
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;
		
        while(i < s.length()) {
            if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) break;
            ans = ans * 10 + s.charAt(i)-'0';
            // check the conditions
            if(sign == -1 && -1*ans < MIN) return MIN;
            if(sign == 1 && ans > MAX) return MAX;
            
            i++;
        }
                
        
        return (int)(ans*sign);
    }
}
