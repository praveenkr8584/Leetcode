class Solution {
    public int maxArea(int[] height) {
        int maxm=Integer.MIN_VALUE;
        int l=0;
        int h=height.length-1;
        while(l<h){
            int amount=(h-l)*Math.min(height[l],height[h]);
            maxm=Math.max(maxm,amount);
            if (height[l] < height[h]) {
                l++;
            } else {
                h--;
            }
        }
        return maxm;
    }
}