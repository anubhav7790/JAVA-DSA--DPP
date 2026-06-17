class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true ; 
        int finalposition = nums.length-1 ; 
        
        for(int i = nums.length-2 ; i>=0 ; i--){
            if( i + nums[i] >= finalposition) finalposition = i ; 
        }

        return finalposition == 0 ; 

    }
}