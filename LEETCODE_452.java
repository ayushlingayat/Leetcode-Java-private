import java.util.Arrays;
import java.util.Comparator;

public class LEETCODE_452 {

	public static void main(String[] args) 
	{
		int arr[][]= {{10,16},{2,8},{1,6},{7,12}};
		
		int res = findMinArrowShots(arr);			
			
		System.out.println(res);
	}
	
	public static int findMinArrowShots(int[][] points) {
        int n=points.length;

        if(n==1) return 1;

        //sorting
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int a1[], int a2[]){
                if(a1[1]==a2[1]) return 0;
                if(a1[1]<a2[1]) return -1;
                return 1;
            }
        });

        int arrows=1;

        // int commonInterval[] = points[0];

        int commonEndPoint = points[0][1];

        for(int i=1;i<n;i++)
        {
            int curS = points[i][0];
            int curE = points[i][1];

            //if intervals are overlapping then we can use existing arrow to burst it
            if(curS>commonEndPoint)
            {
                //start a new interval
                commonEndPoint = curE;
                arrows++;
            }
        }

        return arrows;
    }

}
