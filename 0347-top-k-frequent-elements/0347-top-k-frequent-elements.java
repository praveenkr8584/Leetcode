class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> maxheap=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            maxheap.offer(new int[]{entry.getKey(), entry.getValue()});
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=maxheap.poll()[0];
        }
        return res;
    }
}