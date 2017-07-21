import java.lang.annotation.Target;

public class SearchInsertPosition35 {





	/**
	 * @param args
	 * 
	 *            Given a sorted array and a target value, return the index if
	 *            the target is found. If not, return the index where it would
	 *            be if it were inserted in order.
	 * 
	 *            You may assume no duplicates in the array.
	 * 
	 *            Here are few examples. [1,3,5,6], 5 ¡ú 2 [1,3,5,6], 2 ¡ú 1
	 *            [1,3,5,6], 7 ¡ú 4 [1,3,5,6], 0 ¡ú 0
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
	int[] nums={1,3,5};
	int target=2;
	int a = searchInsert(nums,target)	;
		System.out.println(a);
	}
		
	
	
	
	public static int searchInsert(int[] nums, int target) {
		        int index=nums.length;
		        if(target>nums[nums.length-1]){
		        	return nums.length;
		        }else if (target==nums[nums.length-1]) {
					return nums.length-1;
				}else if (target<nums[0]){
					return 0;
				}else {
					
					
					for (int i = 0;i<nums.length-1;i++){
						if(nums[i]==target){
							index=i;
							break;
						}else{
							if(nums[i+1]>target){
								index=i+1;
								break;
							}
							
						}
						
					}
					
					
					
					
					return index;
				}
		        
		        
		    }
		
	/*public class Solution {  
	    public int searchInsert(int[] nums, int target) {  
	        return binarySearch(nums,target,0,nums.length-1);  
	    }  
	    private int binarySearch(int[] nums, int target, int left, int right) {  
	        // TODO Auto-generated method stub  
	        if(left > right)  
	            return -1;  
	        if(left == right){  
	            if(nums[left] >= target){  
	                return left;  
	            }else{  
	                return right+1;  
	            }  
	        }  
	        int mid = (left + right)/2;  
	        if(target < nums[mid]){  
	            return binarySearch(nums,target,left,mid);  
	        }else if(target == nums[mid]){  
	            return mid;  
	        }else{  
	            return binarySearch(nums,target,mid+1,right);  
	        }  
	    }  
	}  */
		

}
