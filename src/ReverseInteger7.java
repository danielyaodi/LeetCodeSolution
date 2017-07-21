import java.util.BitSet;

/**
 * @author Daniel
 *
 *
 *Reverse digits of an integer.
 *Example1: x = 123, return 321
 *Example2: x = -123, return -321
 *
 *click to show spoilers.
 *
 *Have you thought about this?
 *Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
 *If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
 *Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?
 *For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 *Note:
 *
 *The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 */

public class ReverseInteger7 {
	static int counter=1;
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int num=-1234567890;
		if(num<0){
			num = Math.abs(num);
		}
		
		String numLength = new String().valueOf(num);
		StringBuilder s= new StringBuilder();
		for(int i=numLength.length()-1;i>=0;i--){
			
			s.append(numLength.charAt(i));
		}
//		long newNumber = Integer.valueOf(s.toString());
//		int bit = getDigit(num);
//		
//		int Newnumber= getReverse(bit,num);
		
//		System.out.println(bit);
//		System.out.println(Newnumber);
		
		
		
//		if(Newnumber<=-2147483648||Newnumber>=2147483647){
//			
//			return 0;
//            
//        }else{
//                    return Newnumber;
        
		
	}

	 

	 
 
//numberSolution
	
	/*public class Solution {
	    public int reverse(int x) {
	        int bit = getDigit(x);
			
			int Newnumber= getReverse(bit,x);
	        if(Newnumber<=-2147483648||Newnumber>=2147483647){
	            return 0;
	            
	        }else{
	                    return Newnumber;
	        }

	        
	        
	    }
	    
	    int getReverse(int bit,int num){
	        int sum=(int) (num/(Math.pow(10, bit-1)));
			for(int i=1;i<bit;i++){
				
				 sum+=  (num%10)*(Math.pow(10, (bit-i)));
				 System.out.println("the"+i+"value"+sum);
				 num=num/10;
				 
			}
			return sum;
	        
	        
	    }
	    private int getDigit(int num) {
			int counter=1;
			int temp =num;
			if(temp<0){
				temp=Math.abs(temp);
			}
			if(temp==0){
				return 0;
			}
			while(temp/10>0){
				temp = temp/10;
				counter++;
			}
			return counter;
		}
	    
	    
	}*/

}
