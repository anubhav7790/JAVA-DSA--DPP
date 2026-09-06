class Solution {
    public String removeStars(String s) {
       StringBuilder sb = new StringBuilder(s);
       Stack<Character> S1 = new Stack<>();
       for(char ch : s.toCharArray()){
         if(ch == '*'){
            S1.pop() ; 
         }
         else S1.push(ch) ; 
       }
       sb = new StringBuilder();
       while(!S1.isEmpty()){
          sb.append(S1.pop()) ; 
       }

       return sb.reverse().toString(); 
    }
}