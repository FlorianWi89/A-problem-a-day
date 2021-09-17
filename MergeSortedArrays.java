
public class MergeSortedArrays {
	
	public static int[] merge(int[] nums1, int[] nums2) {
        
		//O(m+n) Time and O(n+m) Space
		int m = nums1.length;
		int n = nums2.length;
		
		
		if(m==0) return nums2;
		
		if(n==0) return nums1;
		
		//create new array and fill it up step by step
		int[] merged= new int[m+n];
		
		int i=0,j=0,k =0;
		
		//traverse both arrays
		while(i < m && j < n) 
		{
			if(nums1[i] < nums2[j]) 
				merged[k++]=nums1[i++];
				
			else 
				merged[k++]=nums2[j++];	
		}
		
		//store the remaining elements from array1
		while(i< m)
			merged[k++]=nums1[i++];
		
		//store the remaining elements from array2
		while(j < n)
			merged[k++]=nums2[j++];
		
		return merged;
		
    } 
	
	public static void main(String[] args) {
		
		
		int[] one = {1,2,2,3};
		int[] two = {3,4,5,7};
		
			
		int[] result = merge(one, two)	;
		for(int x : result) {
			System.out.print(x+" ");
		}
	}

}
