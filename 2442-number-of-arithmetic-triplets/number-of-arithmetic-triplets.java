class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0 ; 
        for(int num : nums){
            set.add(num); 
        }

        for(int num : nums){
            if(set.contains(diff + num) && set.contains(2*diff+num)) count++; 
        }

        return count++;
    }
}