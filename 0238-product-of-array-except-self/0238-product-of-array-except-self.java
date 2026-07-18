class Solution {
    public int[] productExceptSelf(int[] a) {
        int n=a.length;
        int[] b=new int[n];
        int[] c=new int[n];
        b[n-1]=1;
        c[0]=1;
        for(int i=n-2;i>=0;i--){
            b[i]=a[i+1]*b[i+1];
        }
        for(int i=1;i<n;i++){
            c[i]=c[i-1]*a[i-1];
        }
        for(int i=0;i<n;i++){
            a[i]=c[i]*b[i];
        }
        return a;
    }
}