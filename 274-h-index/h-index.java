import java.util.Arrays; 
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int size = citations.length ; 
        for(int i = 0 ; i<citations.length ; i++){
            if(citations[i] >= size) {
                break ;
                
                 
        }
       
        size--; 
    }
   return size ;  
}
}