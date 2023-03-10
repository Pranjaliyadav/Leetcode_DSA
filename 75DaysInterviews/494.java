class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        if(nums==null || nums.length==0) return 0;
        dfs(nums,target,0,0);
        return count;
    }
    
    public void dfs(int nums[],int target,int index,int currSum){
        if(index==nums.length){
            if(currSum==target) count++;
            return;
        }
        
        dfs(nums,target,index+1,currSum+nums[index]);
        dfs(nums,target,index+1,currSum-nums[index]);
    }
}