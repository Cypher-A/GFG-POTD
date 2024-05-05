class Solution {
    public ArrayList<Integer> verticalSum(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        // HashMap to store vertical sum
        Map<Integer, Integer> map = new TreeMap<>();

        // Recursive function to calculate vertical sum
        verticalSumUtil(root, 0, map);

        // Adding sums to the result list
        for (int sum : map.values()) {
            result.add(sum);
        }

        return result;
    }

    // Recursive helper function to calculate vertical sum
    private void verticalSumUtil(Node node, int hd, Map<Integer, Integer> map) {
        if (node == null)
            return;

        // Update vertical sum at this horizontal distance
        map.put(hd, map.getOrDefault(hd, 0) + node.data);

        verticalSumUtil(node.left, hd - 1, map);
        verticalSumUtil(node.right, hd + 1, map);
    }
}
