class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>(); 
        List<List<Integer>> ans = new ArrayList<>(); 

        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>()) ; 

        for(int num : nums1){
            set1.add(num); 
        }

        for(int num : nums2){
            set2.add(num); 
        }
        
        //for finding one 
        for(int i = 0 ; i<nums1.length ; i++){
             if(!set2.contains(nums1[i]) && !set3.contains(nums1[i])){
                set3.add(nums1[i]); 
                ans.get(0).add(nums1[i]); 
             }
        }

        for(int i = 0 ; i<nums2.length ; i++){
             if(!set1.contains(nums2[i]) && !set3.contains(nums2[i])){
                set3.add(nums2[i]); 
                ans.get(1).add(nums2[i]); 
             }
        }

        return ans ;

    }
}
