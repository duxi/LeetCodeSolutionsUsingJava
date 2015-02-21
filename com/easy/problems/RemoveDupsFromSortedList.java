package com.easy.problems;
import com.easy.util.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class RemoveDupsFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
    	if(head==null||head.next==null){
    		return head;
    	}
        ListNode cur = head.next;
        ListNode prev = head;
        
        while(cur != null){
        	if(cur.val==prev.val){
        		prev.next=cur.next;
        		prev=prev.next;
        	}
        	cur=cur.next;
        }
        return head;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
