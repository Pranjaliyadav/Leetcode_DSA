class Solution {
    Set<String> set = new HashSet<>();
    int[] lens;
    public boolean wordBreak(String s, List<String> wordDict) {
        
        int n = s.length(), j;
        prep(set, wordDict, n);
        boolean[] dp = new boolean[n+1];

        // start dp
        dp[0] = true;
        for (int i = 1; i <= n; i++) for (int x : lens) { 
            if ((j = i - x) < 0) break; 
            if (dp[j] && set.contains(s.substring(j, i))) {
                dp[i] = true;
                break;
            }
        }
        return dp[n];
    }

    private void prep(Set<String> set, List<String> wordDict, int n) {
        Set<Integer> lenSet = new HashSet<>();
        for (String w : wordDict) {
            set.add(w);
            lenSet.add(w.length());
        }

        
        lens = new int[lenSet.size()]; int k = 0;
        for (int x : lenSet) lens[k++] = x;
        Arrays.sort(lens);
    }
}