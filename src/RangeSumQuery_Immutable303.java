import javax.print.attribute.standard.NumberUpSupported;

/**
 * @author Daniel
 *
 *Given an integer array nums, find the sum of the elements between indices i and j (i ¡Ü j), inclusive.
*
*Example:
*Given nums = [-2, 0, 3, -5, 2, -1]
*
*sumRange(0, 2) -> 1
*sumRange(2, 5) -> -1
*sumRange(0, 5) -> -3
*Note:
*You may assume that the array does not change.
*There are many calls to sumRange function.
 */
public class RangeSumQuery_Immutable303 {
	
	
	
/*	
 * Other people solution https://my.oschina.net/Tsybius2014/blog/528708
 * 
 * My submitted Solution
 * public class NumArray {
	    int[] sumArray;
	    public NumArray(int[] nums) {
	        sumArray= new int[nums.length];
	        int sum=0;
	        for(int i =0;i<nums.length;i++){
	            sum +=nums[i];
	            sumArray[i]=sum;
	        }
	         
	    }
	    public int sumRange(int i, int j) {
	            if(j==0){
	                return sumArray[0];
	            }
	            if(i==0){
	                return sumArray[j];
	            }
				return sumArray[j]-sumArray[i-1];
			}
	     
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	int []array;

	public RangeSumQuery_Immutable303(int[] nums) {
		array= new int[nums.length];
        int sum=0;
        for(int i =0;i<nums.length;i++){
            sum +=nums[i];
            array[i]=sum;
            System.out.println(sum);
        }

		
	}
	
	
	public int sumRange(int i, int j) {
		
		if(j==0){
			
			return array[0];
		}
		if(i==0){
			return array[j];
			
		}
		return array[j]-array[i-1];
	}
	
	
	
		
		
		
		
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums ={-2,0,3,-5,2,-1};
		RangeSumQuery_Immutable303 obj = new RangeSumQuery_Immutable303(nums);
		int param_1 = obj.sumRange(0,2);
		int param_2 = obj.sumRange(2,5);
		int param_3 = obj.sumRange(0,5);
	}

}


/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */