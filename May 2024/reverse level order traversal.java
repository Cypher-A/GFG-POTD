class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.offer(node);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0; i<size; i++){
                Node current = q.remove();
                ans.add(current.data);
                if(current.right != null){
                    q.offer(current.right);
                }
                if(current.left != null){
                    q.offer(current.left);
                }
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
