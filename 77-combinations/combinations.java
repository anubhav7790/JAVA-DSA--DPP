class Solution {
    public void generate(int n ,int k , int idx ,List<Integer> curr , List<List<Integer>> result  ){
        if(curr.size()== k){
            result.add(new ArrayList<>(curr)) ; 
            return ; 
        }
        if(idx>n) return ; 

        curr.add(idx) ;
        generate(n , k , idx+1 , curr , result ) ;
        curr.remove(curr.size()-1); 
        generate(n , k , idx+1 , curr , result ) ;

        
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>(); 
        boolean used[] = new boolean[n] ;
        generate(n , k , 1 , new ArrayList<>(), result ) ;
        return result ; 
    }

}