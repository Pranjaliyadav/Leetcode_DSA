class Solution {
    public int combinationSum4(int[] nums, int target) {
        int dp[] = new int[target+1];

        dp[0] = 1;
        for(int i = 1; i <= target; i++){
            for(int n:nums){
                if(i-n >= 0){ //making sure array element is not greater than target,eg no way 2 can be made from 3

                dp[i] = dp[i] + dp[i-n];

                }
            }
        }
        return dp[target];
    }
}