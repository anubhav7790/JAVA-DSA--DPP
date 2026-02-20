class Solution {
    public int pivotIndex(int[] nums) {
        int sum[] = new int[nums.length] ;
        sum[0] = nums[0]; 
        for(int i = 1 ; i<nums.length ; i++){
            sum[i] = sum[i-1] + nums[i] ; 
        }
        for(int i = 0 ; i<nums.length ; i++){

            int leftsum = (i == 0) ? 0 : sum[i-1];
            int rightsum = sum[nums.length-1] - sum[i] ; 
            if(leftsum == rightsum) return i ; 
        }
         
        return -1 ; 
    }
}