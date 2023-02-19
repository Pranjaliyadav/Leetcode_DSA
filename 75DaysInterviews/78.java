class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<>();
        findSubset(ans, curr , 0, nums);
        return ans;
    }

    public void findSubset(List<List<Integer>> ans, List<Integer> curr, int start, int[] nums){

        if(start == nums.length){
            ans.add(new ArrayList<Integer>(curr));
            return;
        }
        curr.add(nums[start]);
        findSubset(ans, curr, start+1,nums);

        curr.remove(curr.size() - 1);
        findSubset(ans, curr, start+1, nums);

    }
}