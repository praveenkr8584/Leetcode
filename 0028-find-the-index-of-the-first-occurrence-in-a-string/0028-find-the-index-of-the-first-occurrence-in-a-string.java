class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        while(i<=haystack.length()-needle.length()){
            int j=0;
            while(j<needle.length()){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
                j++;
            }
            if(j==needle.length()){
                return i;
            }
            i++;
        }
        return -1;
    }
}