class Solution {
    public Node removeAllDuplicates(Node head) {
        // Dummy node to handle edge cases easily
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        
        while (head != null) {
            boolean isDuplicate = false;
            // Check if current node is a duplicate
            while (head.next != null && head.data == head.next.data) {
                isDuplicate = true;
                head = head.next;
            }
            if (isDuplicate) {
                // Skip all duplicates
                prev.next = head.next;
            } else {
                // No duplicate, move prev pointer
                prev = prev.next;
            }
            head = head.next;
        }
        
        return dummy.next;
    }
    
    // Utility function to print the linked list
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    
}
