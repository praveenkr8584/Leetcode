class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int t=0;
        int i=0;
        int j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++;
                t++;
            }
            j++;
        }
        return t;
    }
}