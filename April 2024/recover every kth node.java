class Solution {
    // This method deletes every kth node in a linked list
    Node delete(Node head, int k) {
        if (head == null)
            return null;
        int count = 1;
        Node temp = head;
        Node back;

        // If k is 1, delete the entire list and return null
        if (k == 1)
            return null;

        // Traverse through the linked list
        while (temp.next != null) {
            count++;
            back = temp;
            temp = temp.next;

            // If count becomes equal to k, delete current node
            if (count == k) {
                // If current node is the last node, remove its reference from back node
                if (temp.next == null) {
                    back.next = null;
                    return head;
                }
                // Remove current node by changing the reference of back node to the next node
                Node r = temp.next;
                back.next = r;
                temp = r;
                count = 1;
            }
        }
        return head;
    }
}

