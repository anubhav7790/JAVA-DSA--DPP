class Solution {
    public void moveZeroes(int[] nums) {
        int count0 = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]==0){
                count0++; 
            }
        }
       
       for(int i = 0 ; i<count0 ; i++){
          for(int j =0 ; j<nums.length-1; j++){
            if(nums[j] == 0){
                int temp = nums[j];
                nums[j] = nums[j+1]; 
                nums[j+1] = temp ; 
            }
          }
       }

    }
}