class Solution {
    public String reverseVowels(String s) {
        int start = 0 ;
        int end = s.length()-1 ; 
        char arr[] = s.toCharArray() ;    //imp 
        while(start<end){
            if(!isvowel(arr[start])) {
                start++; 
            }
            else if(!isvowel(arr[end])){
                end--;
            }

            else{

                char temp = arr[start] ;
                arr[start] = arr[end] ; 
                arr[end] = temp ; 
                start++;
                end--; 
            }
        }

       return new String(arr) ;  
    }
        public  static boolean isvowel(char c){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'||              c=='A' || c=='E' || c=='I'|| c=='O' || c=='U'){
                return true ;
            }

            return false ; 
        }
    
}       