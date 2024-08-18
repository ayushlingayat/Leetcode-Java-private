
public class LEETCODE_41 
{
	public static void main(String[] args) 
	{
		int nums[] = {7,8,9,11,12};
		
		int res = firstMissingPositive(nums);
		
		System.out.println(res);
	}
	
	public static int firstMissingPositive(int[] a)
    {
        int n=a.length;
        
        for(int i=0;i<n;i++)
        {
        	int ele = a[i]; //4
         	         	
         	if(ele>=1 && ele<=n)
         	{
         		int chair = ele-1; //3
         		if(a[chair]!=ele)
             	{
             		int temp=a[chair];
             		a[chair]=a[i];
             		a[i]=temp;
             		i--;         		
             	}
         	}
        }
        
//        for(int i:a)
//        {
//        	System.out.print(i+" ");
//        }
        
        for(int i=0;i<n;i++)
        {
        	if(i+1!=a[i]) return i+1;
        }
        
        return n+1;
    }
}
