class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>(hs);
        Collections.sort(list);
        int j=0;
        for(int x:list){
            nums[j++]=x;
        }
        return hs.size();
    }
}