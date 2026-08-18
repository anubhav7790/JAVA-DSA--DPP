class Solution {
    public int maxOperations(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for (int num : nums) {

            int needed = k - num;

            if (map.getOrDefault(needed, 0) > 0) {

                count++;

                map.put(needed, map.get(needed) - 1);

            } else {

                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }
}