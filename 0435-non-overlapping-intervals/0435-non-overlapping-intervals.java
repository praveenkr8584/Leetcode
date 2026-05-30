class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int p=intervals[0][1];
        int c=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=p){
                p=intervals[i][1];
            }else{
                c++;
            }
        }
        return c;
    }
}