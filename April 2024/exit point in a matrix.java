class Solution {
    int[] ans = new int[2];
    
    public int[] FindExitPoint(int n, int m, int[][] mat) {
    return solve(0,0,'R', -1, -1, mat);
    }
    
    public int[] solve(int i, int j, char dir, int pi, int pj, int[][] mat)
    {
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length)
        {
            ans[0] = pi;
            ans[1] = pj;
            return ans;
        }
        if(mat[i][j] == 0)
        {
            if(dir == 'L')
            solve(i, j-1, dir, i, j, mat);
            else if(dir == 'D')
            solve(i+1, j, dir, i, j, mat);
            else if(dir == 'U')
            solve(i-1, j, dir, i, j, mat);
            else
            solve(i, j+1, dir, i, j, mat);
        }
        else 
        {
            mat[i][j] = 0;
            if(dir == 'L')
            solve(i-1, j, 'U', i, j, mat);
            else if(dir == 'D')
            solve(i, j-1, 'L', i, j, mat);
            else if(dir == 'U')
            solve(i, j+1, 'R', i, j, mat);
            else
            solve(i+1, j, 'D', i, j, mat);
        }
        return ans;
    }
}
