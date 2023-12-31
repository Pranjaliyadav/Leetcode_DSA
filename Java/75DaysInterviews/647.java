class Solution {
    public int countSubstrings(String s) {
        int totalCount = 0;
        for(int k = 0; k < s.length(); k++)
        {
            int count = 1;
            for(int j = k + 1; j < s.length(); j++)
            {
                if(isPalindrome(s, k, j)) count++;
            }
            totalCount += count;
        }
        return totalCount;
    }

    public boolean isPalindrome(String s, int left, int right)
    {
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}