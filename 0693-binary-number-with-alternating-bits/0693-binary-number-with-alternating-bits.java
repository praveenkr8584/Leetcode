class Solution {
    public boolean hasAlternatingBits(int n) {
        if(n==0 || n==1){
            return true;
        }
        int x=n & 1;
        n=n>>1;
        while(n>0){
            if(x==(n&1)){
                return false;
            }
            x=n&1;
            n=n>>1;
        }
        return true;
    }
}