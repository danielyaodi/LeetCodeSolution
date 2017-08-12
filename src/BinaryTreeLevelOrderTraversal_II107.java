import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.LongToDoubleFunction;

public class BinaryTreeLevelOrderTraversal_II107 {

	/**
	 * @param args
	 * 
	 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
	 * 
	 * For example:
	 * Given binary tree [3,9,20,null,null,15,7],
	 * 
	 *     3
	 *    / \
	 *   9  20
	 *      /  \
	 *     15   7
	 * return its bottom-up level order traversal as:
	 * [
	 *   [15,7],
	 *   [9,20],
	 *   [3] 
	 * ]
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=null;
		levelOrderBottom(root);
		
	}

	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new LinkedList<>();
		if(root==null){
			return list;
		}else  {
			Queue<TreeNode> queue =new LinkedList<>();
			queue.offer(root);
			while (!queue.isEmpty()) {
				List<Integer> sublist = new LinkedList<>();
				 int num = queue.size();
				 for (int i = 0; i < num; i++) {
					if(queue.peek().left!=null){
						queue.offer(queue.peek().left);
					}
					if(queue.peek().right!=null){
						queue.offer(queue.peek().right);
					}
					 sublist.add(queue.poll().val);
				}
				 list.add(0,sublist);
			}
			return list;
			
		}
	}
	
	  
	
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val=x;
		};
		
	}
	
}

 
