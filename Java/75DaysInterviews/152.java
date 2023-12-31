class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int currMaxProductSubarr = nums[0];
        int currMinProductSubarr = nums[0];
        int maxProductAns = nums[0];
        for (int i = 1; i < n; i++) {
            int temp = currMaxProductSubarr;
            currMaxProductSubarr = Math.max(nums[i], Math.max(currMaxProductSubarr * nums[i], currMinProductSubarr * nums[i]));
            currMinProductSubarr = Math.min(nums[i], Math.min(temp * nums[i], currMinProductSubarr * nums[i]));
            maxProductAns = Math.max(maxProductAns, currMaxProductSubarr);
        }
        return maxProductAns;
    }
}