class Solution {
    public int minimumCost(int[] cost) {
        int sum = 0 ; 
        Arrays.sort(cost) ; 
        
        for(int i = cost.length-1 ; i>=0 ; i = i-3 ){

            sum = sum + cost[i] ;
            if(i-1 >=0 ) sum = sum + cost[i-1]; 

        }

        return sum ; 
    }
}