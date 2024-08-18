import java.util.Arrays;

public class LEETCODE_287 
{
	public static void main(String[] args) 
	{
		int n[] = {1,3,4,2,2};
		
		int res = findDuplicate1(n);
		
		System.out.println(res);

	}
	
	public static int findDuplicate1(int[] a) 
	{
		int t[] = new int[a.length+1];
        
        for(int i=0;i<a.length;i++)
		{
        	t[a[i]]++;
		}
        
        for(int i=0;i<a.length;i++)
        {
        	if(t[i]>=2) return i;
        }
                
        return 0;
    }
	
	public static int findDuplicate(int[] a) 
	{
		Arrays.sort(a);
        
        int t=0,psum=0;
		
		for(int i=0;i<a.length;i++)
		{
			int t1= t^a[i];
            if(t1==psum)
            {
                return a[i];
            }

            psum = t1;
		}
        
        return 0;
    }
	
	

}
