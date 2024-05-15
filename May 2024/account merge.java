class Solution {
    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, List<String>> graph = new HashMap<>();
        Map<String, String> emailToName = new HashMap<>();

        for (List<String> account : accounts) {
            String name = account.get(0);
            String firstEmail = account.get(1);
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                graph.computeIfAbsent(firstEmail, x -> new ArrayList<>()).add(email);
                graph.computeIfAbsent(email, x -> new ArrayList<>()).add(firstEmail);
                emailToName.put(email, name);
            }
        }

        Set<String> visited = new HashSet<>();
        List<List<String>> mergedAccounts = new ArrayList<>();

        for (String email : graph.keySet()) {
            if (!visited.contains(email)) {
                List<String> mergedAccount = new ArrayList<>();
                dfs(email, graph, visited, mergedAccount);
                Collections.sort(mergedAccount);
                mergedAccount.add(0, emailToName.get(email));
                mergedAccounts.add(mergedAccount);
            }
        }

        return mergedAccounts;
    }

    private static void dfs(String email, Map<String, List<String>> graph, Set<String> visited, List<String> mergedAccount) {
        visited.add(email);
        mergedAccount.add(email);
        for (String neighbor : graph.get(email)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, graph, visited, mergedAccount);
            }
        }
    }

    public static void main(String[] args) {
        List<List<String>> accounts = Arrays.asList(
                Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"),
                Arrays.asList("John", "johnnybravo@mail.com"),
                Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"),
                Arrays.asList("Mary", "mary@mail.com")
        );

        List<List<String>> mergedAccounts = accountsMerge(accounts);
        for (List<String> account : mergedAccounts) {
            System.out.println(account);
        }
    }
}

     
