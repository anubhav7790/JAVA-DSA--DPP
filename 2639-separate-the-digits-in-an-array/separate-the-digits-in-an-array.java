class Solution {
    public int[] separateDigits(int[] nums) {
       ArrayList<Integer> l = new ArrayList<>();
        String s ; 
        for(int i = 0 ; i<nums.length ; i++){
            s = String.valueOf(nums[i]) ; 
            for(char c : s.toCharArray() ){
                int digit = c-'0'; 
                l.add(digit) ; 
            }
        }
        int arr[] = new int[l.size()] ; 
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = l.get(i) ; 
        }
        return arr; 
       
    }
}