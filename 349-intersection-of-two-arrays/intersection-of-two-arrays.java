class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for(int x : nums1){
            set.add(x);
        }
        
        int result [] = new int[Math.min(nums1.length , nums2.length)] ; 

        int i = 0 ;

        for(int x : nums2){
            if(set.remove(x)){
                result[i++] = x;
            }
        }

        return Arrays.copyOf(result , i);

    }
}