class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int i=0;i<queries.length;i++){
            int ix = queries[i][0];
            while(ix<=queries[i][1]){
                nums[ix]=(int)((1L * nums[ix]*queries[i][3])%1000000007);
                ix+=queries[i][2];
            }
        }
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            res=res^nums[i];
        }
        return res;
    }
}