class Solution {
    public static int ktime(int[] arr,int k){
        int i=0;int j=0;
        int count=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        while(j<arr.length){
            hs.put(arr[j],hs.getOrDefault(arr[j],0)+1);
            while(hs.size()>k){
                hs.put(arr[i],hs.get(arr[i])-1);
                if(hs.get(arr[i])<=0){
                    hs.remove(arr[i]);
                }
                i++;
            }
            count+=j-i+1;
            j++;
            
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] arr, int k) {
        return ktime(arr,k)-ktime(arr,k-1);
    }
}