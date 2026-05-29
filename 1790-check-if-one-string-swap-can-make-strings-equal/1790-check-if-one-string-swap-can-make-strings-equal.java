class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        HashMap<Character,Integer>h1=new HashMap<>();
        HashMap<Character,Integer>h2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char x=s1.charAt(i);
            char y=s2.charAt(i);
            h1.put(x,h1.getOrDefault(x,0)+1);
            h2.put(y,h2.getOrDefault(y,0)+1);
        }
        int d=0;
        if(h1.equals(h2)){
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    d++;
                }
            }
        }
        return d==2?true:false;
    }
}