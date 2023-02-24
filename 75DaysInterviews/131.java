public class Solution {
    public List<List<String>> partition(String s) {
       List<List<String>> res = new ArrayList<>();
       List<String> curr = new ArrayList<>();
       helper(s,res,curr,0);
       return res;
    }

    public void helper(String str, List<List<String>> res, List<String> curr, int index){
        if(index == str.length()){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = index;i < str.length(); i++){
            if(isPalindrome(str,index,i)){
                curr.add(str.substring(index,i+1));
                helper(str,res,curr,i+1);
                curr.remove(curr.size() - 1);
            }
        }

    }

    public boolean isPalindrome(String str,int left,int right){
       while(left <= right)
        {if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        left++;
        right--;
        }
        return true;
    }
}