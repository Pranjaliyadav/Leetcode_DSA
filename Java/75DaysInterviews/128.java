class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for(int n: nums){
            set.add(n);
        }

        int max = 0;

        for(int n : nums){
            if(!set.contains(n - 1)){
            int curr = n;
            int count = 1;

            while(set.contains(curr + 1)){
                curr++;
                count++;
            }

            max = Math.max(max,count);

            }
        }
        return max;

    }
}