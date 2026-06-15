class Solution {
    public int minCostConnectPoints(int[][] points) {
        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
        for(int i=0;i<points.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                int d=Math.abs(points[i][0]- points[j][0])+Math.abs(points[i][1]-points[j][1]);
                adj.get(i).add(new int[]{j,d});
                adj.get(j).add(new int[]{i,d});
            }
            
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((e1,e2)->e1[1]-e2[1]);
        boolean[] visited=new boolean[points.length];
        int mstWeight=0;
        pq.offer(new int[]{0,0});
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int node=curr[0];
            int weight=curr[1];
            if(!visited[node]){
                mstWeight+=weight;
                visited[node]=true;
                for(int[] neighbour:adj.get(node)){
                    if(!visited[neighbour[0]]){
                        pq.offer(new int[]{neighbour[0],neighbour[1]});
                    }
                }
            }
        }
        return mstWeight;
    }
}