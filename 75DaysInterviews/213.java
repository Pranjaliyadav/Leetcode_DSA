class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length < 2) return nums[0];

        int[] fh = new int[nums.length + 1]; //if starting from first house
        int[] sh = new int[nums.length + 1]; //if starting from second house

        fh[0] = 0;
        fh[1] = nums[0];
        sh[0] = 0;
        sh[1] = 0;

        for(int i = 1; i < nums.length;i++){
            fh[i+1] = Math.max(fh[i],fh[i-1] + nums[i]);
            sh[i+1] = Math.max(sh[i],sh[i-1] + nums[i]);
        }
        return Math.max(fh[nums.length - 1], sh[nums.length]); 
    }
}