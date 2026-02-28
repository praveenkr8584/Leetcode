class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> hm=new HashMap<>();
        List<String> result=new ArrayList<>();

        for(int i=0;i<=s.length()-10;i++){
            if(!hm.containsKey(s.substring(i,i+10))){
                hm.put(s.substring(i,i+10),1);
            }else{
                if(hm.get(s.substring(i,i+10))==1){
                    result.add(s.substring(i,i+10));

                }
                hm.put(s.substring(i,i+10),hm.get(s.substring(i,i+10))+1);
            }
        }
        return result;
    }
}