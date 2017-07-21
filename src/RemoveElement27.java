
public class RemoveElement27 {

	/**
	 * @param args
	 *            Given an array and a value, remove all instances of that value
	 *            in place and return the new length.
	 * 
	 *            Do not allocate extra space for another array, you must do
	 *            this in place with constant memory.
	 * 
	 *            The order of elements can be changed. It doesn't matter what
	 *            you leave beyond the new length.
	 * 
	 *            Example: Given input array nums = [3,2,2,3], val = 3
	 * 
	 *            Your function should return length = 2, with the first two
	 *            elements of nums being 2.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 1, 2, 2, 2, 3 };
		int val = 2;
		int a = removeElement(nums, val);
		System.out.println(a);
	}

	public static int removeElement(int[] nums, int val) {
		int num = 0;
		if (nums.length == 0) {
			return 0;
		} else {

			for (int i = 0; i < nums.length; i++) {
				if (nums[i] != val) {
					nums[num++] = nums[i];
				}

			}
			return num;
		}
	}

}
