class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        combineSum2(res,curr,candidates,target,0);
        return res;
    }

    public void combineSum2(List<List<Integer>> res, List<Integer> curr, int[] candidates, int remain, int start){

        if(remain < 0) return;

        else if(remain == 0 ){
            res.add(new ArrayList<Integer>(curr));
            return;
        }
        else{
            for(int i = start; i < candidates.length; i++){
                if(i > start && candidates[i] == candidates[i-1]) continue;
                curr.add(candidates[i]);
                combineSum2(res, curr, candidates, remain - candidates[i],i+1);
                curr.remove(curr.size() - 1);
            }
        }

    }
}