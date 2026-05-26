class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> freq=new HashMap<>();
        for(String word:words){
            freq.put(word,freq.getOrDefault(word,0)+1);
        }
        PriorityQueue<String> maxheap=new PriorityQueue<>((a,b)->freq.get(a).equals(freq.get(b))?a.compareTo(b):freq.get(b)-freq.get(a));
        for(String w: freq.keySet()){
            maxheap.offer(w);
        }
        List<String> res=new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(maxheap.poll());
        }
        return res;
    }
}