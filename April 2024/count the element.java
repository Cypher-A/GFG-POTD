class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
         int[] result = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            int count = 0;
            for (int j = 0; j < b.length; j++) {
                if (b[j] <= a[query[i]]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;

    }
}
