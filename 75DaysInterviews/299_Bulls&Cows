class Solution {
    public String getHint(String s, String guess) {
        int bull=0,cow=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<guess.length();i++){
            char ch=guess.charAt(i);
            char ch2=s.charAt(i);
            if(ch==ch2) {
                bull++;
                if(map.get(ch2)==1) map.remove(ch2);
                else map.put(ch2,map.get(ch2)-1);
            }
        }
           for(int i=0;i<guess.length();i++){
            char ch=guess.charAt(i);
            char ch2=s.charAt(i);
            
            if(ch!=ch2 && map.containsKey(ch)){
                cow++;
                if(map.get(ch)==1) map.remove(ch);
                else map.put(ch,map.get(ch)-1);
            }
          
        }
        String ans=bull+"A"+cow+"B";
        return ans;
    }
}