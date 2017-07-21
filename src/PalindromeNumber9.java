
/**
 * @author Daniel
 *
 * 0 is expect to be true;
 *
 *
 *
 *
 *
 */
public class PalindromeNumber9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		boolean flag=true;
		
		String s = String.valueOf(num);
		if(s.length()<2&&s.length()>1){
			flag=false;
//			System.out.println(flag);
		}
		
		if(s.length()%2==0){
			for(int i = 0;i<s.length()/2;i++){
				if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				      flag=false;
				      break;
					
				}
				
				
			}
		}else{
		for(int i = 0;i<(s.length()-1)/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
			      flag=false;
			      break;
				
			}
			
			
		}
		
		}
		System.out.println(flag);
		
		
	}

}
