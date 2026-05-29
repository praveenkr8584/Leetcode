class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> hs=new HashSet<>();
        for(String b:banned){
            hs.add(b);
        }
        paragraph=paragraph.toLowerCase();
        String[] x=paragraph.split("\\W+");
        HashMap<String,Integer> freq=new HashMap<>();
        for(int i=0;i<x.length;i++){
            if(!hs.contains(x[i])){
                freq.put(x[i],freq.getOrDefault(x[i],0)+1);
            }
        }
        int max=Integer.MIN_VALUE;
        String f_s="";
        for(Map.Entry<String,Integer> entry:freq.entrySet()){
            String st=entry.getKey();
            int n=entry.getValue();
            if(n>max){
                max=n;
                f_s=st;
            }
        }
        return f_s;
    }
}