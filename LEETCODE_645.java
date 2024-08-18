
public class LEETCODE_645 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//        int t1[]={2,2};
		
//		int t1[]= {1,2,2,4};
//		int t1[]= {1,1};
//		
//		int t1[]= {3,2,2};
//		
//		int t1[]= {3,2,3,4,6,5};
		
		int t1[] = {1,5,3,2,2,7,6,4,8,9};
        
        int t2[] = new int[10001];
        int x[] = new int[2];
        
        boolean flag=true;
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<t1.length;i++)
        {
        	max=Math.max(max,t1[i]);
            t2[t1[i]]++;
        }
        
        System.out.println(max);
        
        for(int i=1;i<=max;i++)
        {
            if(t2[i]==2)
            {
            	x[0]=i;
            	break;
            }
        }
        
//        System.out.println(max);
        
//        if(max>1)
//        {
//        	if(t2[max-1]==0)
//        	{
//        		x[1]=max-1;
//        	}
//        	
//        	else if(t2[max+1]==0)
//        	{
//        		x[1]=max+1;
//        	}
//        }
//        
//        else if(max==1)
//        {
//        	if(t2[max+1]==0)
//        	{
//        		x[1]=max+1;
//        	}
//        }
        
        if(max==1)
        {
        	x[1]=2;
        }
        
        else
        {
        	for(int i=1;i<=max;i++)
        	{
        		if(t2[i]==0)
        		{
        			x[1]=i;
        			flag=false;
        			break;
        		}
        	}
        	
        	if(flag) x[1]=max+1;
        }
        
        for(int ele:x)
        {
        	System.out.print(ele+" ");
        }
	}

}
