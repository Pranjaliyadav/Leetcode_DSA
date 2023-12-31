class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();

        findAllPermutations(ans,S,0);
        return ans;
    }

    public void findAllPermutations(List<String> ans, String word, int start){

        ans.add(word);

        for(int i = start; i < word.length() ; i++){
            char[] wordArray = word.toCharArray();

            if(Character.isLetter(word.charAt(i))){
                if(Character.isUpperCase(word.charAt(i))){
                    wordArray[i] = Character.toLowerCase(word.charAt(i));
                    findAllPermutations(ans,String.valueOf(wordArray),i+1);
                }
                else{
                    wordArray[i] = Character.toUpperCase(word.charAt(i));
                    findAllPermutations(ans,String.valueOf(wordArray),i+1);
                }
            }

            
        }


    }
}