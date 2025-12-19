class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         
        for(int i = 0 ; i<nums1.length ; i++){
            boolean next = false ;
            for(int j = indexfinder(nums1[i] ,nums2)+1 ; j<nums2.length ; j++){
                if(nums2[j]>nums1[i]){
                    nums1[i] = nums2[j] ; 
                    next = true ;
                    break ;  
                }
            }
            if(!next){
                nums1[i] = -1 ; 
            }
        }

    return nums1 ; 
    }

    public int indexfinder(int n , int[] num2){
        int m = 0 ; 
        for(int i =0 ; i<num2.length ; i++){
            if(num2[i] == n){
                 m = i ; 
                break ; 
                
                
            }
             
        }
        return m ;
    }
}