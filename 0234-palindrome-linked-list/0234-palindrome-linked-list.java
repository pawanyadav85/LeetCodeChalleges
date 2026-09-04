
class Solution {
    // revese the linked list and call 
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode forr = null;
        ListNode curr = head;
        while(curr != null){
            forr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forr;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // find the middle element 
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // call revese method 
        ListNode head1 = reverse(slow);
        //Compare the reverse and without reverser 
        ListNode i = head;
        ListNode j = head1;
        while(j != null){
            if(i.val != j.val){
                return false;
            }
            i = i.next;
            j = j.next;
        }
        return true;
    }
}