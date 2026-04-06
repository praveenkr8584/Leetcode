class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashSet<List<Integer>> obs=new HashSet<>();
        for(int i=0;i<obstacles.length;i++){
            obs.add(new ArrayList(Arrays.asList(obstacles[i][0],obstacles[i][1])));
        }
        int[][] direction={{0,1},{1,0},{0,-1},{-1,0}};
        int current_direction=0;
        int x=0,y=0;
        int max_sq_dis=0;
        for(int cmd:commands){
            if(cmd==-1){
                current_direction=(current_direction+1)%4;
                continue;
            }
            if(cmd==-2){
                current_direction=(current_direction+3)%4;
                continue;
            }
            int[] dis=direction[current_direction];
            for(int i=0;i<cmd;i++){
                int nextx=x+dis[0];
                int nexty=y+dis[1];
                if(obs.contains(new ArrayList(Arrays.asList(nextx,nexty)))){
                    break;
                }
                x=nextx;
                y=nexty;
            }
            max_sq_dis=Math.max(max_sq_dis,(x*x+y*y));
        }
        return max_sq_dis;
    }
}