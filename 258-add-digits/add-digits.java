import java.util.*; 
class Solution {
    public int addDigits(int num) {
        int n = sumofdigit(num);
        if (n <= 9) {
            return n; 
        }
        return addDigits(n);  
    }

    public int sumofdigit(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10; 
            num = num / 10; 
        }
        return sum; 
    }
}
