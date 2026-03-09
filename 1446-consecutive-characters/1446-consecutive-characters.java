class Solution {
    public int maxPower(String s) {
        int consecutive_bit=0;
        int max_cons_bit=0;
        char x=s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==x){
                consecutive_bit++;
                
            }else{
                max_cons_bit=Math.max(consecutive_bit,max_cons_bit);
                x=s.charAt(i);
                consecutive_bit=1;
            }
        }
        return Math.max(consecutive_bit,max_cons_bit);
    }
}