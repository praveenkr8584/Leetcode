class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        TreeMap<Integer, Integer> t = new TreeMap<>();
        for (int num : nums1) {
            t.put(num, t.getOrDefault(num, 0) + 1);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            Integer x = t.higherKey(nums2[i]); // smallest card strictly greater than nums2[i]
            if (x == null) {
                x = t.firstKey(); // no card beats it, sacrifice the smallest one
            }
            res[i] = x;
            int count = t.get(x);
            if (count == 1) {
                t.remove(x);
            } else {
                t.put(x, count - 1);
            }
        }
        return res;
    }
}