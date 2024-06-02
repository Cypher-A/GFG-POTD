class Solution {
    public static ArrayList<Integer> constructList(int q, int[][] queries) {
        // Initialize the list with the initial value 0
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        
        // Variable to track cumulative XOR
        int cumulativeXOR = 0;
        
        // Process each query
        for (int i = 0; i < q; i++) {
            int type = queries[i][0];
            int x = queries[i][1];
            
            if (type == 0) {
                // Insert (x ^ cumulativeXOR) into the list
                // This ensures that new elements are added as if all previous XOR operations were applied to them
                list.add(x ^ cumulativeXOR);
            } else if (type == 1) {
                // Update the cumulative XOR with x
                cumulativeXOR ^= x;
            }
        }
        
        // Apply the cumulative XOR to all elements in the list
        for (int j = 0; j < list.size(); j++) {
            list.set(j, list.get(j) ^ cumulativeXOR);
        }
        
        // Sort the list
        Collections.sort(list);
        
        return list;
    }    
}
