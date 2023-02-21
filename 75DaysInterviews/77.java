class Solution {
    public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		combine(res, new ArrayList<Integer>(), 1, n, k);
		return res;
	}
	public static void combine(List<List<Integer>> res, List<Integer> curr, int start, int n, int k) {
		if(k == 0 ){
            res.add(new ArrayList<Integer>(curr));
            return;
        }

        for(int i = start; i <= n; i++){
            curr.add(i);
            combine(res,curr,i+1,n,k-1);
            curr.remove(curr.size() - 1);
        }
	}
}