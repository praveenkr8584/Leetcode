class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        // s=s+s;
        // return s.contains(goal);
        for(int i=0;i<s.length();i++){
            if(goal.charAt(i)==s.charAt(0)){
                if((goal.substring(i) + goal.substring(0, i)).equals(s)){
                    
                    return true;
                }
            }
        }
        return false;
    }
}