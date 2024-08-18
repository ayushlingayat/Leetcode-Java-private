
public class LEETCODE_1295 {

	public static void main(String[] args) 
	{
		int a[] = {12,345,2,6,7896};
		
		int res = findNumbers(a);
		
		System.out.println(res);	
	}
	
	public static int findNumbers(int[] a) {
        int c=0;

        for(int i:a)
        {
            if(((int)Math.log10(i)+1)%2==0) c++;
        }

        return c;
    }
}
