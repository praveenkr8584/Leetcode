class Solution {
    public int lengthOfLastWord(String s) {
        String[] x=s.split(" ");
        int n=x.length;
        return x[n-1].length();
    }
}