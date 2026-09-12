/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        // if no element are present in list then return head;
        if(head == null){
            return head;
        }
// suppose new node in head and travel 
        Node curr = head;
        while(curr != null){
            if(curr.child == null ){
                curr = curr.next;
            }else{
                // if the child are found do something
                Node fwd = curr.next;
                Node c = flatten(curr.child);
                curr.child = null;
                curr.next = c;
                c.prev = curr;
                Node temp = c;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = fwd;

                if(fwd != null){
                fwd.prev = temp;
                curr = fwd;
                }
            }
        }
        return head;
    }
}