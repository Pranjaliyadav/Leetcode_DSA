class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length+1][amount+1]; 
        for(int i = 0; i < coins.length+1; i++)
            for(int j = 0; j < amount+1; j++){
               if(i == 0)  
                   dp[i][j] = Integer.MAX_VALUE - 1;
                else if(j == 0)   
                    dp[i][j] = 0;
                else if(i == 1)  
                    if(j%coins[0] == 0)
                        dp[i][j] = j/coins[0];
                    else dp[i][j] = Integer.MAX_VALUE - 1;
                else if(i > 1 && coins[i-1] > j)
                    dp[i][j] = dp[i-1][j];
                else if(i > 1)
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-coins[i-1]] + 1);
            }
        return dp[coins.length][amount] == Integer.MAX_VALUE - 1 ? -1 : dp[coins.length][amount];
    }
}