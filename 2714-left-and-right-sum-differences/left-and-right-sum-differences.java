class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum [] = new int[nums.length] ;
        int rightsum[] = new int[nums.length] ; 

        leftsum[0] = 0 ;
        rightsum[nums.length-1] = 0 ; 
        int sum = 0 ; 
        for(int i = 1 ; i<nums.length ; i++){
            sum = sum + nums[i-1];  
            leftsum[i] = sum ; 
           
        }
       sum = 0 ; 
        for(int j = nums.length-2 ; j>=0 ; j--){
            sum = sum+nums[j+1];
            rightsum[j] = sum ; 
        }
        
        for(int k = 0 ; k<nums.length ; k++){
            nums[k] = Math.abs(leftsum[k] - rightsum[k]) ; 
        }
     

        return nums ; 
    }
}