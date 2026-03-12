class Solution {
    public int findComplement(int n) {
        int x=(int)(Math.log(n)/Math.log(2))+1;
        int y=(1 << x)-1;
        return y^n;
    }
}


