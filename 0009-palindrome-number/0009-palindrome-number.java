class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp=x;
        int sum=0;
        while(x>0){
            int z=x%10;
            sum=sum*10+z;
            x=x/10;
        }
        if(sum==temp){
            return true;
        }else{
            return false;
        }
    }
}