import java.util.Arrays; 
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged [] = new int [nums1.length+nums2.length] ; 
        int i  = 0 ; 
        double median ; 
        while(i<nums1.length){
            merged[i] = nums1[i] ; 
            i++; 
        }
        int j =0 ; 
        while(j<nums2.length){
            merged[i] = nums2[j] ; 
            i++;
            j++;  
        }
        Arrays.sort(merged);
        int n = merged.length/2 ;  
        if(merged.length%2 != 0){
            
            median = merged[n] ; 
            return median ; 
        }
        else{
           int m = merged[n]  ; 
           int a = merged[n-1] ; 
           median = (m+a)/2.0 ; 
           return median ; 
        }

        

    }
}