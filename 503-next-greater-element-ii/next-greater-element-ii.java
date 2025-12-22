class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int next[] = new int[nums.length];
        boolean find ; 
        for(int i = 0 ; i<nums.length ; i++){
             int j =i+1 ;  

             j = j%nums.length;
            

            find = false ;  
            while(i != j ){
                if(nums[j] > nums[i]){
                    next[i] = nums[j] ; 
                    find = true ; 
                    break ; 
                }
                j++;
                j= j%nums.length ; 
            }
            if(!find) next[i] = -1 ; 
        }

        return next ; 
    }
}