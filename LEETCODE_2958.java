import java.util.HashMap;

public class LEETCODE_2958 {

	public static void main(String[] args) {
		int a[] = {1,2,3,1,2,3,1,2};
		int k = 2;
		
		int res = maxSubarrayLength(a,k);
		
		System.out.println(res);

	}
	
	public static int maxSubarrayLength(int[] a, int k) {
        
        int n=a.length;
        if(n==1) return 1;

        int start=0,end=0,maxLen=0;

        HashMap<Integer,Integer> h=new HashMap<>();

        for(end=0;end<n;end++)
        {
            h.put(a[end],h.getOrDefault(a[end],0)+1);

            while(h.get(a[end])>k)
            {
                h.put(a[start], h.get(a[start])-1);
                start++;
            }

            maxLen = Math.max(maxLen,end-start+1);
        }

        return maxLen;
    }

}
