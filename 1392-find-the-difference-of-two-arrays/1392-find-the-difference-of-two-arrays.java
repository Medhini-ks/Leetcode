class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        for (int num : nums2) {
            map.put(num, 1);
        }

        for (int i : nums1) {
            if (!map.containsKey(i)) {
                list.add(i);
                map.put(i, 1);
            }
        }
        res.add(list);
        map = new HashMap<>();
        list = new ArrayList<>();
        for (int num : nums1) {
            map.put(num, 1);
        }

        for (int i : nums2) {
            if (!map.containsKey(i)) {
                list.add(i);
                map.put(i, 1);
            }
        }

        res.add(list);
        return res;
    }
}