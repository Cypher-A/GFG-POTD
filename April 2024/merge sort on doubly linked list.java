class Solution {
    public static Node sortDoubly(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node second = splitList(node);

        node = sortDoubly(node);
        second = sortDoubly(second);

        return merge(node, second);
    }

    public static Node splitList(Node node) {
      
        Node fast = node, slow = node;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
      
        Node temp = slow.next;
        slow.next = null;
        return temp;
    }

    public static Node merge(Node first, Node second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }

        if (first.data < second.data) {
            first.next = merge(first.next, second);
            first.next.prev = first;
            first.prev = null;
            return first;
          
        } else {
            second.next = merge(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }
    }
}

