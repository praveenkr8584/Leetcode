class Solution {
    public int maxProduct(int n) {
        List<Integer> t=new ArrayList<>();
        while(n>0){
            int x=n%10;
            t.add(x);
            n/=10;
        }
        int max_p=0;
        for(int i=0;i<t.size()-1;i++){
            for(int j=i+1;j<t.size();j++){
                int y=t.get(i)*t.get(j);
                max_p=Math.max(max_p,y);
            }
        }
        return max_p;
    }
}