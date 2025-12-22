class Solution {
    public String clearDigits(String s) {
        Stack<Character> S = new Stack<>(); 
        for(int i = 0 ; i<s.length() ; i++){
            if(Character.isLetter(s.charAt(i))){
                S.push(s.charAt(i)) ; 
            }
            else{
                if (!S.isEmpty()) { 
                    S.pop();
            }
        }
        }
        StringBuilder result = new StringBuilder();
         for (char c : S) { 
            result.append(c);
             }
              return result.toString();
    }
    }