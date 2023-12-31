class Solution {
    Boolean memo[][];
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length;i++){
            sum += nums[i];
        }

        if(sum % 2!= 0){ //odd sum
            return false;
        }

        sum = sum/2;
        memo = new Boolean[nums.length+1][sum+1];

        return helper(nums, sum,0);

    }

    public Boolean helper(int[] nums, int sum,int pos){
        if(sum == 0) return true;
        else if(sum < 0 || pos >= nums.length){
            return false;
        }

        if(memo[pos][sum] != null) return memo[pos][sum];

        return memo[pos][sum] = helper(nums,sum - nums[pos],pos+1) || helper(nums,sum,pos+1);
    }
}