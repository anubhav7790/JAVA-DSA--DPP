class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        while(find(original , nums)){
            original = 2*original ; 
            
            
        }
        
      return original ; 
    }

    public static boolean find(int n , int[] nums){
        for(int i = 0 ; i<nums.length ; i++){
            if(n==nums[i]){
               return true ; 
                 
            }
            
            
        }
        return false ; 
    }
}