class Solution {
    private Node prev = null;
    
    public void populateNext(Node root) {
        if (root == null) return;
        
        // Traverse the left subtree
        populateNext(root.left);
        
        // If previous node exists, set its next to the current node
        if (prev != null) {
            prev.next = root;
        }
        // Update previous node to current node
        prev = root;
        
        // Traverse the right subtree
        populateNext(root.right);
    }
}
