class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        combineSum(res,curr, candidates,target,0);
        return res;
    }

    public void combineSum(List<List<Integer>> res, List<Integer> curr, int[] nums, int remain, int start){

        if(remain < 0) return;

        else if(remain == 0) { res.add(new ArrayList<Integer>(curr));}

        else{
            for(int i = start;i < nums.length; i++){
                curr.add(nums[i]);
                combineSum(res, curr, nums, remain - nums[i],i);
                curr.remove(curr.size() - 1);
            }
        }



    }
}