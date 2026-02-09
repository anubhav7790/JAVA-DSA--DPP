class Solution {
    public int calculate(String s) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            
            if (ch == ' ') continue;

          
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--; 
                val.push(num);
            } else { 
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char chr = op.pop();
                    if (chr == '+') val.push(v1 + v2);
                    if (chr == '-') val.push(v1 - v2);
                    if (chr == '*') val.push(v1 * v2);
                    if (chr == '/') val.push(v1 / v2);
                }
                op.push(ch);
            }
        }

        while (!op.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();
            char operator = op.pop();
            if (operator == '+') val.push(v1 + v2);
            if (operator == '-') val.push(v1 - v2);
            if (operator == '*') val.push(v1 * v2);
            if (operator == '/') val.push(v1 / v2);
        }

        return val.peek();
    }

     int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }
}