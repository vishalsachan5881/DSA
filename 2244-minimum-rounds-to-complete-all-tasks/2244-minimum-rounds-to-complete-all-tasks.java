class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int t : tasks) {
            cnt.put(t, 1 + cnt.getOrDefault(t, 0));
        } 
        int rounds = 0;
        for (int v : cnt.values()) {
            if (v == 1) {
                return -1;
            }
            rounds += v % 3 == 0 ? v / 3 : 1 + v / 3;
        }
        return rounds;
    }}