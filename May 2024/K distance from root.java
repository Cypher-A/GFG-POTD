class Tree
{
    void KdistanceUtil(Node root,int k,ArrayList<Integer> nodes){
        if(root == null){
            return;
        }
        if(k == 0){
            nodes.add(root.data);
            return;
        }
        KdistanceUtil(root.left, k-1,nodes);
        KdistanceUtil(root.right, k-1,nodes);
    }
    
    ArrayList<Integer> Kdistance(Node root, int k)
    {
        ArrayList<Integer> nodes = new ArrayList<Integer>();
        
        KdistanceUtil(root,k,nodes);
        
        return nodes;
    }
}
