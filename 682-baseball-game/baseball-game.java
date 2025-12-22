class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        int sum = 0; 

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("C")){
                s.pop(); 
            }
            else if(operations[i].equals("D")){
                int a = s.peek() * 2; 
                s.push(a); 
            }
            else if(operations[i].equals("+")){
                int b = s.peek();
                s.pop(); 
                int c = s.peek(); 
                int d = b + c; 
                s.push(b);
                s.push(d); 
            }
            else{
                int a = Integer.valueOf(operations[i]); 
                s.push(a); 
            }
        }

        while(!s.isEmpty()){
            sum += s.pop();
        }

        return sum; 
    }
}
