class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); 
        
        backtrack(result, new ArrayList<>(), arr, n, k, 0, 0);
        
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] arr, int n, int k, int start, int sum) {
        if (sum == k) {
            result.add(new ArrayList<>(tempList));
            return;
        } else if (sum > k) {
            return;
        }
        
        for (int i = start; i < n; i++) {
            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }
            
            tempList.add(arr[i]);
            backtrack(result, tempList, arr, n, k, i + 1, sum + arr[i]);
            tempList.remove(tempList.size() - 1);
        }
    }
}
