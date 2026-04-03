class Solution {
    public String removeDuplicateLetters(String s) {
        int last[] = new int[26] ;
        for(int i = 0 ; i<s.length(); i++){
            last[s.charAt(i)-'a'] = i ; 
        }

        int i = 0 ;
        Stack<Character> s1 = new Stack<>();
        boolean arr[] = new boolean[26] ;  
        while(i < s.length()){
            char ch = s.charAt(i) ;
           if(arr[s.charAt(i)-'a']){
            i++;
            continue ; 
           }
           while(!s1.isEmpty() && s1.peek() > ch && last[s1.peek()-'a'] >i ){
               arr[s1.peek()-'a'] = false ;
               s1.pop() ; 
           }
           s1.push(ch); 
           arr[ch-'a'] = true ; 
           i++; 
        }

        StringBuilder res = new StringBuilder();
        for (char c : s1) res.append(c);

        return res.toString();
    }
}