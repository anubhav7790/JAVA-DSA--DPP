class Solution {
    public void combsum(int [] arr , int idx , List<Integer> curr , List<List<Integer>> result , int target){
        if(idx == arr.length || target<0) return ; 
        if(target == 0 ){
            result.add(new ArrayList<>(curr)) ;
            return ; 
        }
        curr.add(arr[idx]) ;
        combsum(arr , idx , curr , result , target-arr[idx]) ;
        curr.remove(curr.size()-1) ;
        combsum(arr , idx+1 , curr , result , target) ; 
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>() ;
        combsum(candidates , 0 , new ArrayList<>() , result , target) ;
        return result ; 

    }
}