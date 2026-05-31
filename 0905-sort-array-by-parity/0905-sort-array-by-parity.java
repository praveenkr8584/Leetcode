class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Integer[] x=Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(x,(a,b)-> (a&1) - (b&1));
        return Arrays.stream(x).mapToInt(Integer::intValue).toArray();
    }
}