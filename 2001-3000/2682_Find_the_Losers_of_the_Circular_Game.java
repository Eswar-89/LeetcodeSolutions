class Solution {
    public int[] circularGameLosers(int n, int k) {
        boolean[] seen = new boolean[n];
        int current = 0;
        int counter = 1;
        int losers = n;

        while (!seen[current]) {

            seen[current] = true;
            losers--;
            
            current = (current + counter * k) % n;
            counter++;
        }

        int[] rez = new int[losers];
        counter = 0;

        for (int i = 0; i < n; i++) {
            if (!seen[i]) {
                rez[counter++] = i + 1;
            }
        }

        return rez;
    }
}