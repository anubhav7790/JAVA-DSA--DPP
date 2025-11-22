class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         Map<Integer , Integer > lastIndex = new HashMap<>(); 
         for(int i =0 ; i<nums.length ; i++){
            if(lastIndex.containsKey(nums[i])){
                 int prev = lastIndex.get(nums[i]);
                 if(i-prev<=k ){
                    return true ; 
                 }
            }

            lastIndex.put(nums[i] , i); 
         }
         return false ; 
    }
}