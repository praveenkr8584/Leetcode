class Solution {
    public int[] separateDigits(int[] nums) {
        String x="";
        for(int i=0;i<nums.length;i++){
            x+=String.valueOf(nums[i]);
        }
        
        int[] res=new int[x.length()];

        for(int i=0;i<x.length();i++){
            String y=""+x.charAt(i);
            res[i]=Integer.parseInt(y);
        }

        return res;
    }
}