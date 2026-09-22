class Solution {
    public int fib(int n) {
        if(n==0)return 0;
        int p=0;
        int c=1;
        while(n-->1){
            int t=p+c;
            p=c;
            c=t;
        }
        return c;
    }
}