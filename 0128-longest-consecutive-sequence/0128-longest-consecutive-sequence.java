class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for(int num:nums){
            h.add(num);
        }
        int max_s=0;
        for(int y:h){
            if(!h.contains(y-1)){
                int x=y;
                int c=1;
                while(h.contains(x+1)){
                    c++;
                    x++;
                }
                max_s=Math.max(max_s,c);
            }
        }
        return max_s;
    }
}