class Solution {
    public ArrayList<ArrayList<Integer>> Paths(Node root){
        int[] path=new int[1000]; 
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();  
        printPathsRecur(root, path, 0, paths);  
        return paths; 
    }
    
    public static void printPathsRecur(Node root, int[] path, int pathLen, ArrayList<ArrayList<Integer>> paths){
        if(root==null)
            return; 
        
        path[pathLen]=root.data; 
        pathLen++;
        
        if(root.left==null&&root.right==null){
            paths.add(printArray(path,pathLen));  
            
        }else{
            printPathsRecur(root.left,path,pathLen,paths); 
            printPathsRecur(root.right,path,pathLen,paths); 
        }
    }
    
    public static ArrayList<Integer> printArray(int[] path,int l){
        ArrayList<Integer> p = new ArrayList<Integer>();
        for(int i=0;i<l;i++)
        p.add(path[i]);
        return p;
    }
}
        
