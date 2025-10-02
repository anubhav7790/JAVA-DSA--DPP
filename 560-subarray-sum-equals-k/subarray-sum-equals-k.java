public class Solution {
    public static int subarraySum(int nums[], int n) {
        int currsum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
             currsum = 0;
            for (int j = i; j < nums.length; j++) {
                
                
                    currsum = currsum + nums[j];
                
                if (currsum == n) {   
                    count = count + 1;
                }
            }
        }
        return count;
    }
}