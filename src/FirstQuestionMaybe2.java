
public class  FirstQuestionMaybe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []array = {2,3,4};
		int [] array1 = twoSum(array,6);
		
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		
	}

	
	 
	
	    public static int[] twoSum(int[] nums, int target) {
	        int[] result = new int[2];
	        boolean flag=false;
	        for(int i =0;i<nums.length-1;i++){
	            for(int j = i+1;j<nums.length;j++){
	                if(nums[i]+nums[j]==target){
	                 result[0]=i;
	                    result[1]=j;
	                    flag=true;
	                    break;
	                }
	                
	            }
	            if(flag){
	                    break;
	                }
	        }
	        return result;
	    }
	
	
	
	
	
}
