class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,HashSet<Integer>> mp=new HashMap<>();
        int[] in=new int[numCourses];
        Arrays.fill(in,0);
        for(int i=0;i<prerequisites.length;i++){
            HashSet<Integer> set=mp.getOrDefault(prerequisites[i][1],new HashSet<Integer>());
            set.add(prerequisites[i][0]);
            mp.put(prerequisites[i][1],set);
            in[prerequisites[i][0]]+=1;
        }
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            if(in[i]==0){
                q.offer(i);
            }
        }

        int c=0;

        while(!q.isEmpty()){
            int w=q.poll();
            c++;
            HashSet<Integer> y = mp.getOrDefault(w, new HashSet<>());
            for(int x:y){
                in[x]-=1;
                if(in[x]==0){
                    q.offer(x);
                }
            }
        }
        return c==numCourses;
    }
}