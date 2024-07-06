class Solution {

    public ArrayList<Integer> Ancestors(Node root, int target) {
        ArrayList<Integer> ancestors = new ArrayList<>();
        findAncestors(root, target, ancestors);
        return ancestors;
    }

    private boolean findAncestors(Node root, int target, ArrayList<Integer> ancestors) {
        // Base case: if the root is null, return false
        if (root == null) {
            return false;
        }

        // If the target node is found
        if (root.data == target) {
            return true;
        }

        // If the target is present in either left or right subtree
        if (findAncestors(root.left, target, ancestors) || findAncestors(root.right, target, ancestors)) {
            // If target is found in either subtree, add this node to the ancestors list
            ancestors.add(root.data);
            return true;
        }

        // Return false if the target is not present in either subtree
        return false;
    }
}
