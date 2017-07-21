import java.io.PushbackInputStream;
import java.util.Stack;

public class ValidParentheses20 {

	/**
	 * @param args
	 * 
	 *            Given a string containing just the characters '(', ')', '{',
	 *            '}', '[' and ']', determine if the input string is valid. The
	 *            brackets must close in the correct order, "()" and "()[]{}"
	 *            are all valid but "(]" and "([)]" are not.
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String s = "[[((()))]]";
		boolean ss = isValid(s);

		System.out.println(ss);

	}

	static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		boolean flag = false;
		if (s.length() > 0) {
			stack.push(s.charAt(0));
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
					stack.push(s.charAt(i));
				} else {
					if (s.charAt(i) == ')') {
						if (stack.isEmpty() == true || stack.peek() != '(') {
							stack.push(s.charAt(i));
						} else {
							stack.pop();
						}
					} else {

						if (s.charAt(i) == ']') {
							if (stack.isEmpty() == true || stack.peek() != '[') {
								stack.push(s.charAt(i));
							} else {
								stack.pop();
							}
						}else {
							if (s.charAt(i) == '}') {
								if (stack.isEmpty() == true || stack.peek() != '{') {
									stack.push(s.charAt(i));
								} else {
									stack.pop();
								}
							}							
							
						}
						
					}
				}
			}
			if (stack.isEmpty()) {
				flag = true;
			} else {
				flag = false;
			}

		} else {
			flag = false;
		}

		return flag;
	}

	/*
	 * public class Solution { public boolean isValid(String s) {
	 * Stack<Character> stack = new Stack<Character>();
	 *  stack.push(s.charAt(0));
	 * for(int i=1;i<s.length();i++){
	 *  if(s.charAt(i) == '(' || s.charAt(i) ==	 '{' ||s.charAt(i) == '[' )
	 *   stack.push(s.charAt(i)); 
	 *   else if(s.charAt(i) == ')'){ if(stack.isEmpty() == true || stack.peek() != '(' ){
	 * stack.push(s.charAt(i)); }else{ stack.pop(); } } else if(s.charAt(i) ==
	 * ']'){ if(stack.isEmpty() == true || stack.peek() != '[' ){
	 * stack.push(s.charAt(i)); }else{ stack.pop(); } } else if( s.charAt(i) ==
	 * '}'){ if(stack.isEmpty() == true || stack.peek() != '{' ){
	 * stack.push(s.charAt(i)); }else{ stack.pop(); } } } if(stack.isEmpty() !=
	 * true){ return false; } else{ return true; } } }
	 */
	/*
	 * public class Solution { public boolean isValid(String s) { int
	 * length=s.length(),top=-1,index=0; char[] stack=new char[length]; char[]
	 * str=s.toCharArray(); while(index<length){ if(str[index]==')'){ if(top>=0
	 * && stack[top]=='(')top--; else return false; }else if(str[index]=='}'){
	 * if(top>=0 && stack[top]=='{')top--; else return false; }else
	 * if(str[index]==']'){ if(top>=0 && stack[top]=='[')top--; else return
	 * false; }else stack[++top]=str[index]; index++; } return top==-1; } }
	 */
}
