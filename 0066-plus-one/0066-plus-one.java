class Solution {
    public int[] plusOne(int[] digits) {
        int i;
        for(i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]+=1;
                return digits;
            }
        }
        int[] res=new int[digits.length+1];
        res[0]=1;
        int j=1;
        for(int x:digits){
            res[j++]=x;
        }
        return res;
        
    }
}