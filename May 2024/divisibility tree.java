class Solution {
    public int minimumEdgeRemove(int n, int[][] edges) {
        // Adjacency list to store the tree
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            tree.get(edge[0]).add(edge[1]);
            tree.get(edge[1]).add(edge[0]);
        }
        
        // Array to store size of subtree rooted at each node
        int[] subtreeSize = new int[n + 1];
        
        // DFS to calculate subtree sizes
        int[] result = new int[1]; // To keep track of edges removed
        dfs(1, -1, tree, subtreeSize, result);
        
        return result[0];
    }
    
    private void dfs(int node, int parent, List<List<Integer>> tree, int[] subtreeSize, int[] result) {
        subtreeSize[node] = 1; // Initial size of current node's subtree
        
        for (int child : tree.get(node)) {
            if (child != parent) {
                dfs(child, node, tree, subtreeSize, result);
                subtreeSize[node] += subtreeSize[child];
                
                // If size of child's subtree is even, we can remove this edge
                if (subtreeSize[child] % 2 == 0) {
                    result[0]++;
                }
            }
        }
    }
}

