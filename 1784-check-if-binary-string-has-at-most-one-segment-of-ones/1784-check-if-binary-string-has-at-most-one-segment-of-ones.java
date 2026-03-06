class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.charAt(0)=='0'){
            return false;
        }else if(s.length()<3 && s.charAt(0)=='1'){
            return true;
        }
        int n=s.length();
        int i=0;
        while(i<n-1){
            if(s.charAt(i)=='1' && s.charAt(i+1)=='1'){
                return true;
            }
            i++;
        }
        return false;
    }
}