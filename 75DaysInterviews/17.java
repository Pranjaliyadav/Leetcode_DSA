class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return res;
        }
        
        String[] lettersMap = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        helper(digits, res,lettersMap,0,new StringBuilder());
        return res;
    }

    public void helper(String digits, List<String> res, String[] lettersMap,int start,StringBuilder sb){
        if(start == digits.length()){
            res.add(sb.toString());
            return;
        }

        int num = digits.charAt(start) - '0';
        String numStr = lettersMap[num - 2]; // -2 cuz 0,1 got nothing
        for(int i = 0; i < numStr.length(); i++){
            sb.append(numStr.charAt(i));
            helper(digits,res,lettersMap,start+1,sb);
            sb.deleteCharAt(sb.length() - 1);
        }


    }
}