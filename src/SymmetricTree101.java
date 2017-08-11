
public class SymmetricTree101 {

	/**
	 * @param args
	 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
	 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=null;
		
		 isSame(root);
		
	}

	 
	
	private static   boolean isSame(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null){
			return true;
		}else {
			return isSame(root.left,root.right);
			 
		}
		 
	}
 

	private static boolean isSame(TreeNode left, TreeNode right) {
		// TODO Auto-generated method stub
		if(left==null&& right==null){
			return true;
		}else 
		if(left!=null&&right==null || left==null&&right!=null){
			return false;
		}else {
			return left.val==right.val && isSame(left.left,right.right)&& isSame(left.right,right.left);
		}
		 
	}

 


	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int x){
			val=x;
		}
		
	}
	
}

