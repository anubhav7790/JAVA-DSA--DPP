class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>(); 
        HashMap<String , List<String>> map = new HashMap<>(); 
        for(int i = 0 ; i<strs.length ; i++){
            String  s = strs[i] ;
            char[] chars = s.toCharArray();
            Arrays.sort(chars) ;
            String ss = new String(chars) ;

            if(!map.containsKey(ss)){
                map.put(ss , new ArrayList<>(Arrays.asList(s))) ;
            }
            else{
                map.get(ss).add(s) ; 
            }
        }

        for(List<String> s : map.values()){
            list.add(s) ; 
        }

        return list ; 
    }
}