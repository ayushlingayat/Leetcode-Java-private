public class LEETCODE_190 {
    // you need treat n as an unsigned value
	
	public static void main(String args[])
	{
		int n=-3;
		
		int res = reverseBits(n);
		
		System.out.println(res);
	}
 
    
    public static int reverseBits(int n) {
        
        int res = 0;

        for(int i=0;i<32;i++)
        {
            int lsb = n&1;
            int revLsb = lsb<<(31-i);

            res = res|revLsb;

            n = n>>1; 
        } 
    
        return res;
    }
}