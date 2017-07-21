import java.util.Calendar;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;
import javax.xml.stream.events.StartDocument;

public class RomanToInteger13 {

	/**
	 * @param args
	 *            Given a roman numeral, convert it to an integer.
	 * 
	 *            Input is guaranteed to be within the range from 1 to 3999.
	 * 
	 */
	static String num = "MMMM";
	static int[] numArray ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start(num);
	}
	
	static void start(String num){
		numArray= new int[num.length()];
		getNumArray(num);
		printArray(numArray);
		int a=sum();
		 System.out.println(a);
		
	}

	private static void printArray(int[] numArray2) {
		// TODO Auto-generated method stub
		for(int i=0;i<numArray2.length;i++){
			
			System.out.println(" "+numArray2[i]+" ");
		}
	}

	private static int sum() {
		// TODO Auto-generated method stub
		int total = 0;
		for (int i = 0; i < numArray.length; i++) {
			if (i < numArray.length - 1) {
				if (numArray[i] >= numArray[i + 1]) {
					total += numArray[i];

				} else {

					total -= numArray[i];

				}
			}else{
				total+=numArray[i];
				
			}

		}
		return total;
	}

	private static void getNumArray(String num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < num.length(); i++) {
			numArray[i] = toNum(num.charAt(i));
			System.out.println(numArray[i]);
		}
	}

	static int toNum(char c) {
		int n = 0;
		switch (c) {
		case 73:
			n = 1;
			break;
		case 86:
			n = 5;
			break;
		case 88:
			n = 10;
			break;
		case 76:
			n = 50;
			break;
		case 67:
			n = 100;
			break;
		case 68:
			n = 500;
			break;
		case 77:
			n = 1000;
			break;
		default:
			break;
		}
		return n;
	}

}
