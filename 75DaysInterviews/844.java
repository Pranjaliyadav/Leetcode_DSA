class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != '#'){
                ss.push(c);
            }
            else if(!ss.isEmpty()){
                ss.pop();
            }
        }

        Stack<Character> ts = new Stack<>();
        for(char c : t.toCharArray()){
            if(c != '#'){
                ts.push(c);
            }
            else if(!ts.isEmpty()){
                ts.pop();
            }
        }

        while(!ss.isEmpty()){
            char curr = ss.pop();
            if(ts.isEmpty() || ts.pop() != curr){
                return false;
            }
        }
        return ss.isEmpty() && ts.isEmpty();
    }
}