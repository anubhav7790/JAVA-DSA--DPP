import java.util.*; 
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int result = 0 ; 
        int i = 0; 
        while(i < tokens.length){
             if(tokens[i].equals("+")){
                int a = s.pop();
                //s.pop();
                int b = s.pop(); 
                //s.pop() ;
                s.push(a+b);  

             }
            else if(tokens[i].equals("-")){
               int a = s.pop();
               // s.pop();
                int b = s.pop(); 
               // s.pop() ;
                s.push(b-a); 
             }
            else if(tokens[i].equals("*")){
               int a = s.pop();
              //  s.pop();
                int b = s.pop(); 
               // s.pop() ;
                s.push(a*b);
             }
            else if(tokens[i].equals("/")){
               int a = s.pop();
               // s.pop();
                int b = s.pop(); 
               // s.pop() ;
                result = b/a ; 
                s.push(result);
             }
             else{
                s.push(Integer.parseInt(tokens[i]));
             }
               i++; 

        }

        return s.peek(); 
    }
}