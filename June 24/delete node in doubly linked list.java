class Solution {
    public Node deleteNode(Node head, int x) {
        if (x == 1) {
            if (head!=null) {
                head = head.next;
                if (head!=null) {
                    head.prev = null;
                }
            }
            return head;
        }
        
        Node current=head;
        int i=1;
        while (current!=null && i<x) {
            current=current.next;
            i++;
        }
        
        if (current==null){
            return head; 
        }
        if (current.next!=null) {
            current.next.prev=current.prev;
        }
        if (current.prev!=null) {
            current.prev.next=current.next;
        }
        return head;
    }
}

