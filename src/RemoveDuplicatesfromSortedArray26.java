import java.lang.reflect.Array;
import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray26 {

	/**
	 * @param args
	 *            Given a sorted array, remove the duplicates in place such that
	 *            each element appear only once and return the new length.
	 * 
	 *            Do not allocate extra space for another array, you must do
	 *            this in place with constant memory. For example, Given input
	 *            array nums = [1,1,2], Your function should return length = 2,
	 *            with the first two elements of nums being 1 and 2
	 *            respectively. It doesn't matter what you leave beyond the new
	 *            length.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 1,2 };
		int a = removeDuplicates(array);
		
		System.out.println(a);

	}

	 public static int removeDuplicates(int[] nums) {
	        int num = 1; 
	        if(nums.length>1){
	            for(int i=1;i<nums.length;i++){
	                if(nums[i]!=nums[i-1]){
	                    nums[num++]=nums[i];
	                }
	                
	            }
	             
	        }else{
	            num=nums.length;
	        }
	    return num;
	    }
}
