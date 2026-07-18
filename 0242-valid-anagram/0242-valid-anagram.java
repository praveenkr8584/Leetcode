class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hs=new HashMap<>();
        HashMap<Character,Integer> hs1=new HashMap<>();
        for(char c : s.toCharArray()){
            hs.put(c, hs.getOrDefault(c, 0) + 1);

        }
        for(char c : t.toCharArray()){
            hs1.put(c, hs1.getOrDefault(c, 0) + 1);
        }
        return hs.equals(hs1);

    }
}