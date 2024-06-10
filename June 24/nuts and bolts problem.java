class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {
        // code here
        HashSet<Character> set = new HashSet<>();
        for(char ch : nuts){
            set.add(ch);
        }
        char arr[] = {'!','#','$','%','&','*','?','@','^'};
        int k = 0;
        for(int i =0; i<arr.length; i++){
            if(set.contains(arr[i])){
                nuts[k] = arr[i];
                bolts[k] = arr[i];
                k++;
            }
        }
    
    }
}
