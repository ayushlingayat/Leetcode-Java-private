import java.util.ArrayList;
import java.util.List;

public class LEETCODE_119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1=getRow(30);
		
		System.out.println(l1);

	}
	
	public static List<Integer> getRow(int n) 
    {
        List<Integer> l=new ArrayList<>();

        long val=1;

        l.add(1);
        for(int j=0;j<n;j++)
        {
        	val= (val*(n-j))/(j+1);
        	l.add((int)val);
        }

        return l;
    }

}
