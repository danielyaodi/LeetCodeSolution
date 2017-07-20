
public class TwoSumII_InputArrayIsSorted167 {
	
	 

	/**
	 * @param args
	 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
	 * 
	 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
	 * Please note that your returned answers (both index1 and index2) are not zero-based.
	 * 
	 * You may assume that each input would have exactly one solution and you may not use the same element twice.
	 * 
	 * Output: index1=1, index2=2
	 * 
	 */
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []array = {2,3,4};
		int [] array1 = twoSum(array,6);
		
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		
	}

	
	public static int[] twoSum(int[] numbers, int target) {
        if(numbers[numbers.length-1]*2<target){
            throw new RuntimeException("ACCESS_TOKEN get error");
        }
        int size=numbers.length;
        int[] result = {1,2};
        boolean flag = false;
        for(int i = 0;i<numbers.length;i++){
            if (numbers[i]>target){
                   size = i;
                
            }
         
        }
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(numbers[i]+numbers[j]==target){
                    result[0]=i+1;
                result[1]=j+1;
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
