class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum = 0 ; 
        int rightsum = 0 ;
        int max = 0 ;
        for(int i = 0 ; i<k ; i++){
            leftsum = leftsum + cardPoints[i] ; 
        }
        max = leftsum ; 
        int rightidx = cardPoints.length-1 ; 
        for(int j = k-1 ; j>=0 ; j--){
            leftsum = leftsum - cardPoints[j] ; 
            rightsum = rightsum + cardPoints[rightidx] ;
            rightidx-- ; 

            max = Math.max(max , leftsum+rightsum)  ; 
        }

        return max ; 
    }
}