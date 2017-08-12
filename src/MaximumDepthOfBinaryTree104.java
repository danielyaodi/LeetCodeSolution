

public class MaximumDepthOfBinaryTree104 {

	/**
	 * @param args
	 * Given a binary tree, find its maximum depth.
	 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = null;
		
		checkDepth(root);	
		
		
	}
	
	
	private static int checkDepth(TreeNode root) {
		if(root==null){
			return 0;
		}
		if (root.left==null&&root.right==null){
			return 1;
			
		}
		int l =  checkDepth(root.left);
		int r = checkDepth(root.right);
		
		return l>r?l+1:r+1;
		
		
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
