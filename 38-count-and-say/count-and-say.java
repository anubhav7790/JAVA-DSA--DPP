class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1" ; 
        }
        
        String s = countAndSay(n-1) ; //11 
        String result=""; 
        
        for(int i = 0 ; i<s.length() ; i++){   //0-2
           int count = 1 ; 
           while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1) ){
             count++ ; 
               i++;
           }

           result = result+String.valueOf(count)+s.charAt(i); 
        }

        return result ; 
    }
}