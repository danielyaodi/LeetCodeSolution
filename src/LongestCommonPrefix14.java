import java.util.Arrays;

import javax.print.PrintService;

import org.omg.IOP.Codec;

public class LongestCommonPrefix14 {
	 
	 
	/**
	 * @param args
	 *            Write a function to find the longest common prefix string
	 *            amongst an array of strings.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "aaa","aaa" };
		
		
		String prefix =  s.length==0?s[0]:"";
	 	
		 
		
		
	}
	public String longestCommonPrefix(String[] strs) {
        String prefix = strs.length==0?"":strs[0];
        for(int i =0;i<strs.length;i++){
            
            prefix = getPrefix(prefix,strs[i]);
        }
		return prefix;
        
       
        
        
        
        
    }
	public String getPrefix(String Origin, String Target){
        StringBuilder s = new StringBuilder();
        int size = Origin.length()>Target.length()?Target.length():Origin.length();
        
        for(int i=0;i<size;i++){
            if(Origin.charAt(i)==Target.charAt(i)){
                
                s.append(Origin.charAt(i));
            }else{
                break;
            }
            
        }
        return s.toString();
        
    }
	
	
	
	
	 /*
	public String longestCommonPrefix(String[] strs) {  
	    String result = strs.length==0?"":strs[0];  
	    for(int j=0;j<strs.length;j++){  
	        result = commonPrefix(result,strs[j]);  
	    }  
	    return result;  
	}  
	private String commonPrefix(String origin,String target){  
	    StringBuffer sb = new StringBuffer();  
	    int loop = origin.length()>=target.length()?target.length():origin.length();  
	    for(int i=0;i<loop;i++){  
	        if(origin.charAt(i) == target.charAt(i)){  
	            sb.append(origin.charAt(i));  
	        }else{  
	            break;  
	        }  
	    }  
	    return sb.toString();  
	}  */

	/*public static String longestCommonPrefix(String[] strs) {
		 
		    StringBuilder result = new StringBuilder();  
		      
		    if (strs!= null && strs.length > 0){  
		      
		        Arrays.sort(strs);  
		          
		        char [] a = strs[0].toCharArray();  
		        char [] b = strs[strs.length-1].toCharArray();  
		          
		        for (int i = 0; i < a.length; i ++){  
		            if (b.length > i && b[i] == a[i]){  
		                result.append(b[i]);  
		            }  
		            else {  
		                return result.toString();  
		            }  
		        }  
		    }
		    return result.toString();  
		 
		
	}*/
	/*public String longestCommonPrefix(String[] strs) {  
	    if (strs.length == 0) return "";  
	        String pre = strs[0];  
	    for (int i = 1; i < strs.length; i++)  
	        while(strs[i].indexOf(pre) != 0)  
	            pre = pre.substring(0,pre.length()-1);  
	    return pre;  
	}  
	*/
	
}