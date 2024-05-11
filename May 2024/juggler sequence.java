class Solution {
    static List<Long> jugglerSequence(long n) {
        List<Long> list = new ArrayList<>();
        list.add(n);
        
        while(n != 1){
            if((n & 1) == 0){
                n = (long)Math.sqrt(n);
                list.add(n);
            }
            else{
                n = (long)Math.pow(n, 1.5);
                list.add(n);
            }
        }
        return list;
    }
}

