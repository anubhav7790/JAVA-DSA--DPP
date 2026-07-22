class Solution {
    public int largestAltitude(int[] gain) {
       int max = Integer.MIN_VALUE ; 
       int prefix[] = new int[gain.length+1]  ;
       prefix[0] = 0 ; 
       prefix[1] = gain[0] ; 
       for(int i = 2 ; i<prefix.length ; i++){
           prefix[i] = prefix[i-1] + gain[i-1] ; 
       }

       for(int j : prefix){
          max = Math.max(max , j) ; 
       } 

       return max ; 
    }
}