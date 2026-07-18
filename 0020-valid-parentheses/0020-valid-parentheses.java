class Solution {
    public boolean isValid(String s) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push((int)s.charAt(i));
                continue;
            }
            if(st.peek() == (int)s.charAt(i)-1 || st.peek() == (int)s.charAt(i)-2){
                st.pop();
            }else if(st.peek() != (int)s.charAt(i)-1 || st.peek() != (int)s.charAt(i)-2){
                st.push((int)s.charAt(i));
            }

        }
        return st.size()>0?false:true;
    }
}