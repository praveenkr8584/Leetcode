class Solution {
    public int mirrorDistance(int n) {
        int y=n;
        int x=0;
        while(n>0){
            int temp=n%10;
            x=(x*10)+temp;
            n/=10;
        }
        return Math.abs(x-y);
    }
}