import org.omg.CORBA.PUBLIC_MEMBER;

public class SameTree100 {

	/**
	 * @param args
	 * Given two binary trees, write a function to check if they are equal or not.
	 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeNode p =  null ;
		TreeNode q =  null ;
		
		isSameTree(p,q);
		
		
		
		
		 
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	private static  boolean isSameTree(TreeNode p, TreeNode q) {
		// TODO Auto-generated method stub
		if(p==null&&q==null){
			return true;
		}else {
			if(p==null&&q!=null || p!=null&&q==null){
				return false;
			} else if(p.val!=q.val){
				return false;
			}
			return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
			 
		}
		
	}
















	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) {
			val=x;
		}
		
	}
	
}
