
public class MaximumSubarray53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -2, 1 };
		int a = maxSubArray(nums);

		System.out.println(a);
	}

	 public static int maxSubArray(int[] A) {
	 int thisSum = A[0] > 0 ? A[0] : 0;
	 int maxSum = A[0];
	
	 for (int i = 1; i < A.length; ++i) {
	 thisSum += A[i];
	 if (thisSum > maxSum) {
	 maxSum = thisSum;
	 }
	 if (thisSum < 0) {
	 thisSum = 0;
	 }
	 }
	
	 return maxSum;
	 }


}
