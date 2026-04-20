class Solution {
    public int maxDistance(int[] colors) {
        int maxm=Integer.MIN_VALUE;
        for(int i=0;i<colors.length;i++){
            for(int j=i+1;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                    maxm=Math.max(maxm,(j-i));
                }
            }
        }
        return maxm;
    }
}