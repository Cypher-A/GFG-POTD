class Tree {
    ArrayList<Integer> noSibling(Node node) {
        ArrayList<Integer> result = new ArrayList<>();
        if (node == null)
            return result;
        findNoSibling(node, null, result);
        java.util.Collections.sort(result);
        if (result.isEmpty())
            result.add(-1);
        return result;
    }

    private void findNoSibling(Node node, Node parent, ArrayList<Integer> result) {
        if (node == null)
            return;

        if (parent != null && parent.left == node && parent.right == null)
            result.add(node.data);
        if (parent != null && parent.right == node && parent.left == null)
            result.add(node.data);

        findNoSibling(node.left, node, result);
        findNoSibling(node.right, node, result);
    }
}

