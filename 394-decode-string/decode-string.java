class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>(); 
        Stack<String> string = new Stack<>(); 
        int k = 0 ;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                k = (k*10)+(c-'0') ; 
                continue ; 
            }

            if(c =='['){
                num.push(k); 
                k=0; 
                string.push(String.valueOf(c)); 
                continue ; 
            }

            if(c != ']'){
                string.push(String.valueOf(c)) ; 
                continue ; 
            }

            // we get ']'
            StringBuilder temp = new StringBuilder(); 
            while(!string.peek().equals("[")){
                temp.insert(0, string.pop()) ; 
            }

            //remove "[" 
            string.pop() ; 
           //make new string
            StringBuilder replace = new StringBuilder(); 
            int count = num.pop(); 
            for(int i= 0 ; i<count ; i++){
                replace.append(temp) ; 
            }

            string.push(replace.toString()) ; 
        }
        StringBuilder result = new StringBuilder();
        while(!string.isEmpty()){
            result.insert(0,string.pop()) ;
        }

        return result.toString(); 

    }
}