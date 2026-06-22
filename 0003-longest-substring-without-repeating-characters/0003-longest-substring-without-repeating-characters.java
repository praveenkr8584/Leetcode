class Solution {
    public int lengthOfLongestSubstring(String s) {
        int fp=0;
        int mp=0;
        int n=s.length();
        int maxs=0;
        HashSet<Character> hs=new HashSet<>();
        while(fp<n && mp<n){
            if(hs.contains(s.charAt(mp))){
                hs.remove(s.charAt(fp));
                fp++;
            }else{
                hs.add(s.charAt(mp));
                mp++;
                maxs=Math.max(maxs,hs.size());
            }
        }
        return maxs;
    }
}