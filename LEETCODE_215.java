import java.util.Arrays;

public class LEETCODE_215
{
	public static void main(String[] args) 
	{
		int nums[] = {3,5,7,3,7,12,62};
		
		// Method-1
		
//		Arrays.sort(nums);
//      System.gc();
//      return nums[nums.length-k];
		
		
		
		// Method-2
		
//		List<Integer> l =Arrays.stream(nums).boxed().collect(Collectors.toList());
//      Optional<Integer> a = l.stream().sorted(Comparator.reverseOrder()).skip(k-1).findFirst();
//      return a.get();
		
		
		
		
		// Method-3
		
//		Integer a[] = new Integer[nums.length];
//      for(int i=0;i<nums.length;i++)
//      {
//         a[i]= nums[i];
//      }
//		Arrays.sort(a, Comparator.reverseOrder());
//      return a[k-1];
		
		
		
		
		// Method-4
		
//		Integer a[] = Arrays.stream(nums).boxed().toArray(Integer[]::new);        
//      Arrays.sort(a, Comparator.reverseOrder());
//      return a[k-1];


	}
}
