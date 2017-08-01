import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.security.auth.callback.LanguageCallback;
import javax.xml.ws.spi.WebServiceFeatureAnnotation;

public class TextJustification68 {

	/**
	 * @param args
	 *            Given an array of words and a length L, format the text such
	 *            that each line has exactly L characters and is fully (left and
	 *            right) justified.
	 * 
	 *            You should pack your words in a greedy approach; that is, pack
	 *            as many words as you can in each line. Pad extra spaces ' '
	 *            when necessary so that each line has exactly L characters.
	 * 
	 *            Extra spaces between words should be distributed as evenly as
	 *            possible. If the number of spaces on a line do not divide
	 *            evenly between words, the empty slots on the left will be
	 *            assigned more spaces than the slots on the right.
	 * 
	 *            For the last line of text, it should be left justified and no
	 *            extra space is inserted between words.
	 * 
	 *            For example, words: ["This", "is", "an", "example", "of",
	 *            "text", "justification."] L: 16.
	 * 
	 *            Return the formatted lines as: [ "This is an", "example of
	 *            text", "justification. " ] Note: Each word is guaranteed not
	 *            to exceed L in length.
	 * 
	 */
	public static void main(String[] arg) {
		String[] words = {"This", "is", "an", "example", "of",
				             "text", "justification."};
		int maxWidth = 16;
		// TODO Auto-generated method stub
		List<String> ll = new ArrayList<>();
			ll=	fullJustify(words, maxWidth);
			for(int i=0;i<ll.size();i++){
				System.out.println(ll.get(i));
			}

	}

	public static List<String> fullJustify(String[] words, int maxWidth) {
		ArrayList<String> l = new ArrayList<String>();
		int arrLen = words.length;

		if (arrLen < 1) {
			
			return l;
		} else {

			int i = 0;
			while (i < arrLen) {
				int j = i + 1;
				int currentLen = 0;
				currentLen += words[i].length();
				while (j < arrLen && currentLen + 1 + words[j].length() <= maxWidth) {
					currentLen += words[j].length() + 1;
					j++;
				}
				StringBuilder sb = new StringBuilder();
				sb.append(words[i]);
				if (j == arrLen) {
					for (int k = i + 1; k < j; k++) {
						sb.append(" " + words[k]);

					}
					while(sb.length()<maxWidth){
						sb.append(" ");
					}
					l.add(sb.toString());
				} else {
					if (j - i == 1) {
						while (sb.length()<maxWidth) {
							sb.append(" ");
							
						}
						 
						l.add(sb.toString());
					} else {
						int wordSpace = j - i - 1;
						int wordCount = currentLen - wordSpace;
						int space = maxWidth - wordCount;

						int eachWordSpace = space / wordSpace;
						int leftSpace = space % wordSpace;
						for (int k = i + 1; k < j; k++) {
							for (int m = 0; m < eachWordSpace; m++) {
								sb.append(" ");
							 }
							 if(leftSpace>0){
								sb.append(" ");
								leftSpace--;
							 }

							sb.append(words[k]);
							}
						 

						l.add(sb.toString());
					}

				}
					i=j;
			}

			  
				return l;
	}

	}
}
