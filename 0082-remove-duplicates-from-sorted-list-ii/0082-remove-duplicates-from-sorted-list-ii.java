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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        ListNode i = head;
        while(i != null){
            //if i or i ka next value same ho 
            if(i.next != null && i.val == i.next.val){

                //Skip the duplicates 
                ListNode j = i.next;
                while(j != null && j.val == i.val){
                    j = j.next;
                }
                i = j;
            }else{ 
                //connect current node those are unique
                 t.next = i;
                 t = i;
                 i = i.next; 
            }
        } 
         t.next = i;
         return dummy.next;
    }
}