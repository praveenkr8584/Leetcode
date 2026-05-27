class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> minheap=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<nums2.length;i++){
            int sum=nums1[0]+nums2[i];
            minheap.offer(new int[]{sum,0,i});
        }
        List<List<Integer>> res=new ArrayList<>();
        while(k-->0){
            int[] x=new int[3];
            x=minheap.poll();
            List<Integer> ls=new ArrayList<>();
            ls.addAll(Arrays.asList(nums1[x[1]], nums2[x[2]]));
            res.add(ls);
            if(x[1]+1<nums1.length){
                int sum2=nums1[x[1]+1]+nums2[x[2]];
                minheap.offer(new int[]{sum2,x[1]+1,x[2]});
            }
        }
        return res;
    }
}