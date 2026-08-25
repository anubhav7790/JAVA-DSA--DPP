class Solution {
    public int maxVowels(String s, int k) {
        int count = 0 ;
        int max = 0 ;
        
        //first window 
        for(int i = 0 ; i<k ; i++){
            if(isvowel(s.charAt(i))) count++ ; 
        }

        max = count ; 

        for(int i = k ; i<s.length() ; i++){

            //remove 
            if(isvowel(s.charAt(i-k))) count--; 
           //add 
            if(isvowel(s.charAt(i)))  count++;

            max =  Math.max(count , max); 
        }
        return max ; 
    }

    boolean isvowel(char c){
        if(c=='a'||c=='e'||c=='i'|| c=='o'||c=='u') return true ; 

        return false ; 
    }
}