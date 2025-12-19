import java.util.*; 
class Solution {
    public boolean isValid(String s) {
        Stack<Character> S = new Stack<>(); 
        for(int i = 0 ; i<s.length() ; i++){
            char c = s.charAt(i) ;
            if(c=='(' || c=='{' || c=='['){
                S.push(c); 
            }

            else{
                if(S.isEmpty()) return false ; 
                if((S.peek()=='('&& c==')') || (S.peek()=='{'&& c=='}') || (S.peek()=='['&& c==']')) S.pop(); 

                else return false ; 

                
            }
        }
        if(S.isEmpty()) return true ; 
        else return false ; 
    }
}