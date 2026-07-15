class Solution {

    public int gcdOfOddEvenSums(int n) {
        int evensum = n*(n+1);
        int oddsum = n*n;

        while(evensum > 0 && oddsum > 0){
            if(evensum > oddsum){
                evensum = evensum%oddsum;
            }else{
                oddsum = oddsum%evensum;
            }
        }

        if(evensum == 0){
            return oddsum;
        }else{
            return evensum;
        }
    }
}
