class Solution {
    public String longestPalindrome(String s) {
        int[][] dp=new int[s.length()][s.length()];
        int max_l=0;
        int e=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(s.length()-j-1)){
                    if(i==0 || j==0){
                        dp[i][j]=1;
                    }else{
                        dp[i][j]=1+dp[i-1][j-1];
                        
                    }
                    if(dp[i][j]>=max_l){
                        max_l=Math.max(max_l,dp[i][j]);
                        e=i;
                    }
                }
            }
            
        }
        int ix=e-max_l+1;
        return s.substring(ix,e+1);
    }
}