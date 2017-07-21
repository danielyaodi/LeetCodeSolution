import java.awt.List;
import java.util.LinkedList;

public class MergeTwoSortedLists21 {

	/**
	 * @param args
	 *            Merge two sorted linked lists and return it as a new list. The
	 *            new list should be made by splicing together the nodes of the
	 *            first two lists.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode l1 = null;
		ListNode l2 = null;
		mergeTwoLists(l1, l2);

	}

	/**
	 * Definition for singly-linked list. public class ListNode { int val;
	 * ListNode next; ListNode(int x) { val = x; } }
	 */

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode result = new ListNode(0);
		if (l1 == null) {
			result = l2;
		}
		if (l2 == null) {
			result = l1;
		}
		if (l1.val < l2.val) {
			result = l1;
			result.next = mergeTwoLists(l1.next, l2);
		} else {
			result = l2;
			result.next = mergeTwoLists(l1, l2.next);
		}

		return result;
	}
	
	
	
	
	
	/*public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

	      ListNode rt = new ListNode(0);
	        ListNode h = rt;

	        while( l1 != null && l2 != null){
	            if(l1.val < l2.val){
	                rt.next = l1;
	                l1 = l1.next;
	            }else{ 
	                rt.next = l2;
	                l2 = l2.next;
	            }

	            rt = rt.next;
	        }

	        if(l1 != null) rt.next = l1;
	        else rt.next = l2;


	        return h.next;
	}
	*/
	
	
	
	
	
	
	
	
	
	

}
