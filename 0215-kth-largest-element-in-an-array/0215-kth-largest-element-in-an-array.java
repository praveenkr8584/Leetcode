class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>();
        for(int num:nums){
            maxheap.offer(-num);
        }
        for(int i=0;i<k-1;i++){
            maxheap.poll();
        }
        return -maxheap.poll();
    }
}