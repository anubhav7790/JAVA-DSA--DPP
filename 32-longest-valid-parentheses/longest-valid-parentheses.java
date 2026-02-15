class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> s1 = new Stack<>(); 
        int max = 0 ; 
        s1.push(-1); 
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i); 

            if(ch =='(') s1.push(i); 

            else{
                s1.pop(); 
                if(s1.isEmpty()){
                    s1.push(i);
                }
                 max = Math.max(i-s1.peek() , max) ;

            }
        }

        return max ; 
    }
}