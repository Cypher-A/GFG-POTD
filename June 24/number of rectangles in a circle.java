class Solution {
    int rectanglesInCircle(int r) {
      
     double area;
     double diagonal;
       int cnt=0;
       for(int i=1;i<=2*r;i++)
       {
           for(int j=1;j<=2*r;j++) 
           {
               diagonal=Math.sqrt(i*i+j*j);
               if(diagonal<=(2*r)) 
               {
                   cnt++;
                   
               }
               
           }
           
       }
       return cnt;
        
    }
}
