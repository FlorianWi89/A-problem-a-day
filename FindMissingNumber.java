
public class FindMissingNumber {
	
	
	//the following code will take an int[] and the gauss 
	//sum as it's arguments and returnsthe missing number in the sequence
	public static void missingNum(int x,int[]nums) {
		
		int numsSum = 0;
		for(int i : nums) {
			numsSum+=nums[i];
		}
		
		int targetNum=x-numsSum;
		
		if(targetNum == 0) {
			System.out.println("No number is missing");
		}else {
			System.out.println(x-numsSum);
		}
	}

	public static void main(String[] args) {
		/*The task was to find the missing number in an int
		 * array which contains the numbers from 0 to 100
		 */

		//first useful information: the sum of all integers 
		//from 0 to 100, for that I will use the gauss formula
		
		int sumFrom1To100= (100*101)/2; //the variable has now the value of 5050
		System.out.println(sumFrom1To100);
		
		int[]numbers=new int[101];
		for(int i=0; i<=100; i++) {
			numbers[i]=i;
		}

		//now delete one random number of the numbers array
		numbers[45]=0;
		
		//the functions computes the difference between the gauss sum
		//and the sum of the given array. The result is our missing number
		missingNum(sumFrom1To100, numbers);
		 
		
	}

}
