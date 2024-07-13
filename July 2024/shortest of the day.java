class Solution {
    public List<Integer> shortestPath(int n, int m, int edges[][]) {
        // Create an adjacency list for the graph
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        // Populate the adjacency list with the given edges
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }
        
        // Priority queue to store (cost, node) and a map to store the shortest distance to each node
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 1}); // Starting with node 1 with cost 0
        
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        
        // Array to track the path
        int[] prev = new int[n + 1];
        Arrays.fill(prev, -1);
        
        // Dijkstra's algorithm
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int currDist = curr[0], u = curr[1];
            
            if (u == n) break; // Stop if we reached the target node
            
            for (int[] neighbor : graph.get(u)) {
                int v = neighbor[0], weight = neighbor[1];
                if (currDist + weight < dist[v]) {
                    dist[v] = currDist + weight;
                    pq.offer(new int[]{dist[v], v});
                    prev[v] = u;
                }
            }
        }
        
        // If there's no path to node n
        if (dist[n] == Integer.MAX_VALUE) {
            return Arrays.asList(-1);
        }
        
        // Reconstruct the path from 1 to n
        List<Integer> path = new ArrayList<>();
        for (int at = n; at != -1; at = prev[at]) {
            path.add(at);
        }
        Collections.reverse(path);
        
        // Adding the total cost as the first element of the list
        path.add(0, dist[n]);
        
        return path;
    }
}
