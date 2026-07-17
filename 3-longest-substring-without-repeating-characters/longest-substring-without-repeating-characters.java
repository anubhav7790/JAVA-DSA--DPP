class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[] ;
        int maxlen  = 0 ; 
        for(int i = 0 ; i<s.length() ; i++){
            hash = new int[256] ;
            for(int j = i ; j<s.length(); j++){
               if(hash[s.charAt(j)] ==1) break ; 

               int len = j-i+1 ; 
               maxlen = Math.max(len , maxlen) ; 
               hash[s.charAt(j)] = 1 ; 
            }
        }
        return maxlen ; 
    }
}