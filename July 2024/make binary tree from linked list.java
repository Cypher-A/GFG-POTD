class Solution {
    public Tree convert(Node head, Tree node) {
        if (head == null) {
            return null;
        }
        node = new Tree(head.data);
        Tree curr = node;
        head = head.next;
        Queue<Tree> q = new LinkedList<>();
        q.add(curr);
        while (head != null) {
            Tree current = q.poll();
            Tree left = new Tree(head.data);
            current.left = left;
            q.add(left);
            head = head.next;
            if (head != null) {
                Tree right = new Tree(head.data);
                current.right = right;
                q.add(right);
                head = head.next;
            }
        }
        return node;
    }
}
