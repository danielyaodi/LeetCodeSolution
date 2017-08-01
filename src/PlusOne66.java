
public class PlusOne66 {

	/**
	 * @param args
	 * 
	 *            Given a non-negative integer represented as a non-empty array
	 *            of digits, plus one to the integer.
	 * 
	 *            You may assume the integer do not contain any leading zero,
	 *            except the number 0 itself.
	 * 
	 *            The digits are stored such that the most significant digit is
	 *            at the head of the list.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = { 9,9,9,8,9};

		int [] a = plusOne(digits);
		for(int i =0;i<a.length;i++){
			System.out.println(a[i]);
			
		}
		
		
	}

	public static int[] plusOne(int[] digits) {
		int[] newDig= new int[digits.length+1];
		if(digits[digits.length-1]<9){
			digits[digits.length-1]=digits[digits.length-1]+1;
			return digits;
			
		}else {
			int next=1;
			digits[digits.length-1]=0;
			
			for(int i = digits.length-2;i>=0;i--){
				if(digits[i]==9&&next==1){
					digits[i]=0;
					next=1;
					
				}else{
					digits[i]=digits[i]+next;
					next=0;
				}
				
				
			}
			
			
			
			if(next==1){
				newDig[0]=1;
				for(int i =0;i< digits.length;i++){
					newDig[i+1]=digits[i];
					
				}
			}else {
				newDig=digits;
			}
			
			
			return newDig;
			
			
			
			
		}
		/*public int[] plusOne(int[] digits) {  
	          
	        int c = 1;  
	        int len = digits.length;  
	        int temp = 0;  
	        for(int i = len-1 ; i>=0 ; i--){  
	            temp = digits[i] + c;  
	            digits[i] = temp % 10;  
	            c = temp / 10;  
	        }  
	        if(c == 0)  
	            return digits;  
	        else{  
	            int[] res = new int[len+1];  
	            res[0] = 1;  
	            for(int i = 0; i < len; i++){  
	                res[i+1] = digits[i];  
	            }  
	            return res;  
	        }  
	    }  */
	}
}
