class Solution {
    public int thirdMax(int[] nums) {
       int max = Integer.MIN_VALUE ; 
       if(nums.length == 0) return max ; 
       Set<Integer> numbers = new HashSet<>(); 
       for(int a : nums){
        numbers.add(a) ; 
       }
       List<Integer> sortedlist = new ArrayList<>(numbers); 
       Collections.sort(sortedlist); 
       if(sortedlist.size() <=2 ) return sortedlist.get(sortedlist.size()-1) ; 

       return sortedlist.get(sortedlist.size()-3) ; 
    }
}