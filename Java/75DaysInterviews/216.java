class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        combineSum3(res, curr, k, n , 1);
        return res;

    }

    public void combineSum3(List<List<Integer>> res, List<Integer> curr, int k, int target, int start){
        if(k < 0 || target < 0){return;}
        if(k == 0 && target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start; i<= 9; i++){
            curr.add(i);
            combineSum3(res,curr,k-1,target - i, i+1);
            curr.remove(curr.size() - 1);
        }
    }
}