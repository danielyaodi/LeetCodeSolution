
public class LengthOfLastWord58 {

	/**
	 * @param args
	 *            Given a string s consists of upper/lower-case alphabets and
	 *            empty space characters ' ', return the length of last word in
	 *            the string.
	 * 
	 *            If the last word does not exist, return 0.
	 * 
	 *            Note: A word is defined as a character sequence consists of
	 *            non-space characters only.
	 * 
	 *            For example, Given s = "Hello World", return 5.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s =  " hello Worl d123 ";
			int a = lengthOfLastWord(s);
			System.out.println(a);
	}
public static int lengthOfLastWord(String s) {
		int length = 0;
		s=s.trim();
		if(s.length()!=0){
			 
			 
			if (s.lastIndexOf(32)==-1) {
				length = s.length();
			}else {
				length=s.length()-s.lastIndexOf(32)-1;
			}
		}
	
	
	return length;
	
    }

}
