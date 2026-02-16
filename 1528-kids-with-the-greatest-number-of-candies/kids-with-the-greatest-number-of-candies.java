class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> l = new ArrayList<>(); 
        int max = Integer.MIN_VALUE ; 
        for(int i = 0 ; i<candies.length ; i++){
            if(max < candies[i]) max = candies[i]; 
        }
        for(int i = 0 ; i<candies.length ; i++){
            if(candies[i]+extraCandies >= max) l.add(true) ; 
            else l.add(false); 
        }

        return l ; 

    }
}