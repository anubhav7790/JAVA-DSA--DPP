class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE ;
        for(int i = 0 ; i<nums.length ; i++){
            int sum = 0 ; 
            String s = Integer.toString(nums[i]) ; 
            for(int j = 0 ; j<s.length() ; j++){
                 sum = sum + s.charAt(j)-'0' ; 
            }
            min = Math.min(min , sum); 
        }

        return min ; 
    }
}