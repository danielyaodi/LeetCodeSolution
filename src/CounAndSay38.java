
public class CounAndSay38 {

	/**
	 * @param args
	 * 
	 *            The count-and-say sequence is the sequence of integers with
	 *            the first five terms as following:
	 * 
	 *            1. 1 2. 11 3. 21 4. 1211 5. 111221 1 is read off as "one 1" or
	 *            11. 11 is read off as "two 1s" or 21. 21 is read off as "one
	 *            2, then one 1" or 1211. Given an integer n, generate the nth
	 *            term of the count-and-say sequence.
	 * 
	 *            Note: Each term of the sequence of integers will be
	 *            represented as a string.
	 * 
	 *            Example 1:
	 * 
	 *            Input: 1 Output: "1" Example 2:
	 * 
	 *            Input: 4 Output: "1211"
	 */
	public static void main(String[] args) {
		
		
		int n=6;
		String a = countAndSay(n);
		System.out.println(a);
		// TODO Auto-generated method stub
	}

 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        //�ݹ���ã�Ȼ����ַ�������
        String str = countAndSay(n-1) + "*";//Ϊ��strĩβ�ı�ǣ�����ѭ������
        char[] c = str.toCharArray();
        int count = 1;
        String s = "";
        for(int i = 0; i < c.length - 1;i++){
            if(c[i] == c[i+1]){
                count++;//��������
            }else{
                s = s + count + c[i];//�����*������﷽��ͳһ����
                count = 1;//��ʼ��
            }
        }
        return s;
    }

	 
}
