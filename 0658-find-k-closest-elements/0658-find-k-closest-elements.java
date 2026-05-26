class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // int[] a=new int[arr.length];
        // HashMap<Integer,Integer> ab=new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     int an=Math.abs(arr[i]-x);
        //     ab.put(an,arr[i]);
        // }
        PriorityQueue<int[]> minheap=new PriorityQueue<>((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        for(int num:arr){
            int y=Math.abs(num-x);
            minheap.offer(new int[]{y,num});
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(minheap.poll()[1]);
        }
        Collections.sort(res);
        return res;
    }
}