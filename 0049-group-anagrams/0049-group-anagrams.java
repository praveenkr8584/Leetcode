class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str = strs[i];
            // Convert to char array
            char[] chars = str.toCharArray();
            // Sort
            Arrays.sort(chars);
            // Convert back to string
            String sorted = new String(chars);
            if(map.containsKey(sorted)){
                map.get(sorted).add(strs[i]);
            }else{
                map.put(sorted,new ArrayList<>(Arrays.asList(strs[i])));
            }
        }
        return new ArrayList<>(map.values());
    }
}