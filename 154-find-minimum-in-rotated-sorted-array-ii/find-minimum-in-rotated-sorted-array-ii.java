class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE ; 
        int left = 0 ;
        int right = nums.length-1 ; 
        while(left<=right){
            int mid =left+ (right-left)/2 ; 
            if(nums[mid] <= min) min = nums[mid] ; 
            if(nums[mid] > nums[right]) left = mid+1 ;
            else if(nums[mid] < nums[right]) right =  mid-1 ;
            else right-- ; 
        }

        return min ; 
    }
}