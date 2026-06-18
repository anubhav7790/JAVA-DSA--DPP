class Solution {
    public int jump(int[] nums) {
      int dest = nums.length-1 ;
      int totaljump = 0 ;
      int coverage = 0 ;
      int lastjump = 0 ;
      if(nums.length == 1) return 0;
      for(int i = 0 ; i<nums.length ; i++){
        coverage = Math.max(coverage , i+nums[i]) ;
        if( i == lastjump){
            lastjump = coverage ;
            totaljump++ ; 

            if(coverage == dest) return totaljump ; 
        }
      }

      return totaljump ;   
    }
}