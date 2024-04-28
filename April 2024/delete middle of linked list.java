class Solution {
    Node deleteMid(Node head) {
        // Base cases: empty list or single node list
        if (head == null || head.next == null) {
            return null;
        }

        // Initialize two pointers, slow and fast
        Node slow = head;
        Node fast = head;
        Node prev = null;

        // Move slow pointer one step at a time and fast pointer two steps at a time
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node(s) pointed by slow pointer
        prev.next = slow.next;

        return head;
    }
}

