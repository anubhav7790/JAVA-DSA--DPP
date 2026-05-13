class Solution {
    int generate(int nums[] , int idx , int target ){
        if(idx == nums.length ){
            if(target == 0) return 1 ; 
            else return 0 ; 
        }

      int plus =  generate(nums , idx+1 , target-nums[idx]) ;
       int minus =  generate(nums , idx+1 , target+nums[idx]) ; 

       return plus+minus ; 
    }
    public int findTargetSumWays(int[] nums, int target) {
        return generate(nums , 0 , target) ;
    }
}