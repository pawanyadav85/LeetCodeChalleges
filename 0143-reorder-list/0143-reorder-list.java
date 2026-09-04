
class Solution {
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode fwd = null;
        ListNode curr = head;
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head1 = slow.next;
        slow.next = null;
         head1 = reverse(head1);
        ListNode i = head;
        ListNode j = head1;
        while(j != null){
            ListNode temp1 = i.next;
            ListNode temp2 = j.next;
            i.next = j;
            j.next = temp1;
            i = temp1;
            j = temp2;
        }
    }
}