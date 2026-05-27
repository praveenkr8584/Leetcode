class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>((a,b)->b-a);
        for(int stone:stones){
            maxheap.offer(stone);
        }
        while(maxheap.size()>1){
            int x=maxheap.poll();
            int y=maxheap.poll();
            if((x-y)!=0){
                maxheap.offer(x-y);
            }
        }
        return maxheap.size()==1?maxheap.poll():0;
    }
}