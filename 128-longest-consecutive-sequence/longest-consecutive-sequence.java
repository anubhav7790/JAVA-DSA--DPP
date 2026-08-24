class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0 ; 
        Arrays.sort(nums) ;
        int count = 0 ;
        int countmax = 0 ; 
        for(int i = 0 ; i<nums.length-1 ; i++ ){
            if(Math.abs(nums[i]-nums[i+1]) == 1){
                count++; 
               if(countmax<count)
                 countmax = count ; 
            
             
            } 
            else if(Math.abs(nums[i]-nums[i+1]) == 0) continue ; 
            else count = 0 ;   
        }

        return countmax+1 ; 
    }
}