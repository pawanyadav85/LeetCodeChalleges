/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = null;
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        curr = prev;
        int max = prev.val;
        while(curr != null && curr.next != null){
            if(curr.next.val < max ){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
                max = curr.val;
            }
        }
        curr = prev;
        prev = null;
        fwd = null;
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}