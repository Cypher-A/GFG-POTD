class Solution
{
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        int i = 0, j = 0; 
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        while (i < n && j < m) 
        { 
            while(  i+1<n  &&  arr1[i]==arr1[i+1]  )
                i++;
           while(  j+1<m  &&  arr2[j]==arr2[j+1]  )
                j++;
                
            if (arr1[i] < arr2[j]) 
                ans.add(arr1[i++]);
          
            else if (arr2[j] < arr1[i]) 
                ans.add(arr2[j++]);
                
            else
            {
                ans.add(arr2[j++]);
                i++;
            }
        } 
        
        while(i < n)
        {
            while(  i+1<n  &&  arr1[i]==arr1[i+1]  )
                i++;
            
            ans.add(arr1[i++]);
        }
        while(j < m)
        {
            while(  j+1<m  &&  arr2[j]==arr2[j+1]  )
                j++;
            
            ans.add(arr2[j++]);
        }
        
        return ans;   
        }
}

