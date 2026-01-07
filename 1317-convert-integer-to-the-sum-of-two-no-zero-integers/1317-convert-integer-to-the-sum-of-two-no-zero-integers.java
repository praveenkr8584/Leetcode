class Solution {
    public boolean havez(int x){
        boolean hasZero = false;

        int temp = x;
        while (temp > 0) {
            if (temp % 10 == 0) {
                hasZero = true;
                break;
            }
            temp /= 10;
        }

        return hasZero?false:true;
    }
    public int[] getNoZeroIntegers(int n) {
        int[] a=new int[2];
        for(int i=1;i<n;i++){
            if(havez(i) && havez(n-i)){
                a[0]=i;
                a[1]=n-i;
                break;
            }
        }
        return a;
    }
}