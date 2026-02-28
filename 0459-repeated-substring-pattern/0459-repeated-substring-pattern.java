class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String x=s+s;
        x=x.substring(1,x.length()-1);
        for(int i=0;i<=x.length()-s.length();i++){
            if(x.charAt(i)==s.charAt(0)){
                if(x.substring(i,i+s.length()).equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}