class Solution {
    public void rev(char[] s, int i){
        if(i==(s.length/2)) return;
        char t=s[i];
        s[i]=s[s.length-1-i];
        s[s.length-1-i]=t;
        rev(s,i+1);
    }
    public void reverseString(char[] s) {
        rev(s,0);
    }
}