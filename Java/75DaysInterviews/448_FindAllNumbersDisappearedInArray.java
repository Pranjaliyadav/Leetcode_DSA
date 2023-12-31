// As we walk through all elements in the array, we can use the current element as an index and flag its value (in place). All numbers are > 0, so we can use a negative number.
// In the end, the indexes of all positive numbers in the array are the missing values.

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i : nums){
            int ix = Math.abs(i);
            if(nums[ix -1] > 0){
                nums[ix - 1] *= -1;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length;i++){
            if(nums[i] > 0){
                res.add(i+1);
            }
        }
        return res;
    }
}