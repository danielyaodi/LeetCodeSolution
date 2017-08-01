import javax.xml.transform.Templates;

public class AddBinary67 {

	/**
	 * @param args
	 *            Given two binary strings, return their sum (also a binary
	 *            string).
	 * 
	 *            For example, a = "11" b = "1" Return "100".
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "1";
		String b = "1";
		
		String c = addBinary(a,b);
		
		System.out.println(c);

	}
	
	public static String addBinary(String a, String b) {  
	    int maxLen = Math.max(a.length(), b.length());  
	    StringBuilder sb = new StringBuilder();  
	    int carry = 0;  
	    for (int i = 0; i < maxLen; i++) { //���ұ߿�ʼ��λȡ���ַ��� a��b ���ַ�ֵ tempA �� tempB��������Ȳ��㣬����0���  
	        int tempA = a.length() > i ? a.charAt(a.length() - i - 1) - '0' : 0;  
	        int tempB = b.length() > i ? b.charAt(b.length() - i - 1) - '0' : 0;  
	        sb.insert(0, (tempA + tempB + carry) % 2);  //������������ӽ��  
	        carry = tempA + tempB + carry > 1 ? 1 : 0;  //�õ���λ  
	    }  
	    if (carry == 1) sb.insert(0, 1);  //������λ�н�λ�������λ��Ҫ��һλ 1  
	    return sb.toString();  
	}  
        
        
        
       
     
}
