class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minheap=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int[] x:points){
            int is = x[0] * x[0] + x[1] * x[1];
            minheap.offer(new int[]{is,x[0],x[1]});
        }
        int[][] res=new int[k][2];
        for(int i=0;i<k;i++){
            int[] y=new int[3];
            y=minheap.poll();
            res[i][0]=y[1];
            res[i][1]=y[2];

        }
        
        return res;
    }
}