class Solution {
    public String helper(Node root, List<Node> ans, HashMap<String, Integer> m) {
        if (root == null) {
            return "# "; // Return a special character to represent a null node
        }

        String node = Integer.toString(root.data) +
                      " "; // Convert the data of the current node to a string

        // Recursively generate the string representation of the left and right subtrees
        node += helper(root.left, ans, m);
        node += helper(root.right, ans, m);

        // Check if the current subtree is a duplicate
        if (m.containsKey(node) && m.get(node) == 1) {
            ans.add(root); // Add the root of the duplicate subtree to the result vector
            m.merge(node, 1,
                    Integer::sum); // Increase the count of the duplicate subtree
        } else if (!m.containsKey(node)) {
            m.put(node, 1); // Insert the string representation of the subtree into the
                            // unordered map with a count of 1
        }

        return node; // Return the string representation of the current subtree
    }

    public List<Node> printAllDups(Node root) {
        List<Node> ans = new ArrayList<>(); // Vector to store the roots of all the
                                            // duplicate subtrees
        HashMap<String, Integer> m =
            new HashMap<>(); // Unordered map to keep track of the string
                             // representations of subtrees

        // Call the helper function to recursively generate the string representations
        // of all subtrees and find the duplicates
        helper(root, ans, m);

        return ans; // Return the vector of duplicate subtrees
    }
}
