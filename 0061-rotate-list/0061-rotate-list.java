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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0){
            return head;
        }
        //find length 
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            length ++;
        }
        k = k % length;
        if(k == 0){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        //fast ko n tak travel karo
        for(int i = 1;i <= k ;i++){
            fast = fast.next;
        }
        // move fast and slow one step fast next != null 
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        //create new node and slow divide two parts
        ListNode a = slow.next;
        slow.next = null;
        fast.next = head;
        return a;
    }
}