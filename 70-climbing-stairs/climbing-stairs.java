class Solution {
    HashMap<Integer , Integer> map = new HashMap<>(); 
    public int climbStairs(int n) {
        n= n+1 ; 
        int x = find(n) ; 
        return x ; 
    }
 public  int find(int n) {
        if(n==0) return  0 ;
        if(n==1) return 1 ; 

        if (map.containsKey(n)) {
            return map.get(n);
        }

        // Otherwise compute and store in HashMap
        int value = find(n - 1) + find(n - 2);
        map.put(n, value);

        return value;


 }

}