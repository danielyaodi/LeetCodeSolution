import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class ImplementstrStr28 {

	/**
	 * @param args
	 *            Implement strStr().
	 * 
	 *            Returns the index of the first occurrence of needle in
	 *            haystack, or -1 if needle is not part of haystack.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "a,d,f,g,as,d";
		String needle = "f";

		int a = strStr(haystack, needle);
		System.out.println(a);
	}

	public static int strStr(String haystack, String needle) {
		int index = 0;
		index = haystack.indexOf(needle);
		return index;
	}

}
