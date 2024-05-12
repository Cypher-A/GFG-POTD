class Solution {
    public int minSteps(int d) {
        int steps = 0;
        int position = 0;

        while (position < d || (position - d) % 2 != 0) {
            steps++;
            position += steps;
        }

        return steps;
    }
}
