class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        k=k%mat[0].length;
        // code here
       int[][] second_array = new int[mat.length][];
         print(mat, k,second_array);
         return second_array;
    }
    public static void print(int[][] mat, int k,int[][]second_array) {
        for (int c = 0; c < mat.length; c++) {
            second_array[c] = new int[mat[c].length];
            int[] number = mat[c];
            int[] number2 = second_array[c];
            int i = 0;
            int j = k;
            while (i != number.length) {
                number2[i] = number[j];
               // System.out.print(number2[i] + " ");
                j++;
                j = j % number.length;
                i++;
            }

            //System.out.println();
        }
       // return second_array;
    }

}
