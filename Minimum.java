import java.util.Arrays;

class DTW{
	public static void main(String[] args){
		int[] nums = {2,2,3,4,1,5,6,7,8,9};
		int minimum = nums[0];
		for ( int i = 0 ; i < nums.length ; i++ ){
			if(nums[i] < minimum){
				minimum = nums[i];
			}
			
		}
		System.out.println("Minimum is:" + minimum);
		int[] array1 = Arrays.copyOfRange(nums,0,minimum);
		for ( int i = 0 ; i < nums.length ; i++ ){
		System.out.println(array1[i]);
		}
	}
}