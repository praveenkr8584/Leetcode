class Solution {
    public int trap(int[] height) {
        Stack<Integer> st=new Stack<>();
        int n=height.length;
        st.push(height[n-1]);
        for(int i=n-2;i>=0;i--){
            st.push(Math.max(height[i],st.peek()));
        }
        int res=0;
        Stack<Integer> st2=new Stack<>();
        st2.push(height[0]);
        st.pop();
        for(int i=1;i<n;i++){
            if(height[i]>st2.peek()){
                st2.push(Math.max(st2.peek(),height[i]));
                st.pop();
            }else{
                if((Math.min(st2.peek(),st.peek())-height[i])>=0){
                    res+=(Math.min(st2.peek(),st.peek())-height[i]);
                }
                
                st2.push(Math.max(st2.peek(),height[i]));
                st.pop();
            }
        }
        return res;

    }
}
// class Solution {
//     public int trap(int[] height) {
//         Stack<Integer> stack = new Stack<>();
//         int res = 0;
        
//         for (int i = 0; i < height.length; i++) {
//             while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
//                 int top = stack.pop();
//                 if (stack.isEmpty()) break;
//                 int distance = i - stack.peek() - 1;
//                 int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];
//                 res += distance * boundedHeight;
//             }
//             stack.push(i);
//         }
        
//         return res;
//     }
// }
