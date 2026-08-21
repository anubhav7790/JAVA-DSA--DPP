class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : nums){
             map.put(i,map.getOrDefault(i,0)+1) ; 
        }
        
        List<Integer> bucket[] = new ArrayList[nums.length+1] ;

        for(int num : map.keySet()){
            int freq = map.get(num);
            if(bucket[freq] == null){
               bucket[freq] = new ArrayList<>() ; 
            }
            bucket[freq].add(num) ; 
        }
 
        int result[] = new int[k] ;
        int count = 0 ; 
        for(int i = bucket.length-1 ; i>0 && count<k ; i-- ){
             if(bucket[i]!= null){
                for(int j : bucket[i]){
                     result[count] = j ; 
                     count++ ; 

                     if(count==k) break ; 
                }
             }
        }

        return result ; 
    }
}