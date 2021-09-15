import java.util.HashSet;

public class FindCycle {
	
	//Brute Force Approach which takes O(n**2) time
	public static int getCycle(int i, int[]nums) {
		
		HashSet<Integer> set=new HashSet<Integer>();
		int t = nums[i];
		
		while(!set.contains(t)) {
			set.add(t);
			t=nums[t];
		}
		
		return set.size();
	}
	
	public static int biggestCycle(int[] nums) {
		
		int longestCycle=0;
		
		for (int i=0; i<nums.length;i++) {
			
			int t = getCycle(i, nums);
			if( t > longestCycle) {
				longestCycle = t;
			}
		}
		return longestCycle;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[] numbers = {0,1,2};
		
		int q = biggestCycle(numbers);
		System.out.println("Der längste Zyklus ist: "+q);

	}

}
