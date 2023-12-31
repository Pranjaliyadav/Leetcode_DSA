class Solution {
    public int rob(int[] num) {
        if(num.length == 0) return 0;

        int dp[] = new int[num.length + 1];
        dp[0] = 0;
        dp[1] = num[0];

        for(int i = 1; i<num.length;i++){
            dp[i+1] = Math.max(dp[i], dp[i-1] + num[i]);
        }
        return dp[num.length];
}
}