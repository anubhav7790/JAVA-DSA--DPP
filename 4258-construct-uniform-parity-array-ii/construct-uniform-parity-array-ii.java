class Solution {
    public boolean uniformArray(int[] nums1) {

        boolean iseven = false ;
        boolean isodd = false ;

        for(int i : nums1){
            if(i%2==0) iseven = true ;
            else isodd = true ; 
        }

        if(!(iseven && isodd)) return true ; 

        int minodd = Integer.MAX_VALUE;
        for(int i : nums1){
            if(i%2 == 1){
                minodd = Math.min( i , minodd) ; 
            }
        }

        for(int j : nums1){
            if(j%2==0 && j<minodd) return false ; 
        } 

        return true ;

    }
}