
public class Leetcode_278_First_Bad_Version 
{
	public static void main(String[] args) 
	{
		
	}
	
	public int firstBadVersion(int n)
    {
        int l=1;
        int h=n;
        int fbv=-1;
        int mid;

        while(l<=h)
        {
            mid= l+((h-l)/2);

            if(isBadVersion(mid))
            {
                fbv=mid;
                h=mid-1;
            }

            else
            {
                l=mid+1;
            }
        }

        return fbv;
    }
}
