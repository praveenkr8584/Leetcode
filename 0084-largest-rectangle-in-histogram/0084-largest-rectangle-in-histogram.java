class Solution {
    public static int[] findnextsmaller(int arr[]){
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int res[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            res[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return res;
    }

     public static int[] findprevsmaller(int arr[]){
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
              res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
          return res;
    }
    public int largestRectangleArea(int[] heights) {
        int ns[]=findnextsmaller(heights);
        int ps[]=findprevsmaller(heights);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int h=heights[i];
            int w=ns[i]-ps[i]-1;// upper-lower-1
            max=Math.max(max,(h*w));
        }
        return max;
    }
}