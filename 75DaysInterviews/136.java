//bit manipulation solution by XOR operator- takes tc o(n) and sc o(1)  cuz using one variable answer
//in XOR if same bits then 0 ans
//A^A = 0
//A^0 = A
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i:nums){
            ans = ans ^ i;
        }
        return ans;
        
    }
}