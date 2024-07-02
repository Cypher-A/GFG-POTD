class Solution {
    String str="";
    public void helper(Node r){
        while(r!=null){
            str+=r.data;
            r=r.next;
    }
    }
    public boolean palindrome(){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
          if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;j--;
        }return true;
        
    }
    public boolean compute(Node root) {
        helper(root);
        return palindrome();
    }
}
