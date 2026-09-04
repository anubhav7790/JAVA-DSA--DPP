class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length ; 
        int [] max = new int[n] ;
        max[0] = nums[0] ; 
        int [] min = new int[n] ;
        min[n-1] = nums[n-1]  ; 
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 1 ; i<n ; i++){
            max[i] = Math.max(max[i-1] , nums[i]) ; 
        }
        for(int i = n-2  ; i>=0 ; i--){
            min[i] = Math.min(min[i+1] , nums[i]) ; 
        }
        
        int minidx = Integer.MAX_VALUE ; 
        for(int j = 0 ; j<n ; j++){
            if(max[j] - min[j] <= k){
                minidx = Math.min(minidx , j) ;
            }
        }

        if(minidx == Integer.MAX_VALUE) return -1 ;
        else return minidx ; 

    }
}