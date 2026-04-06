class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        if(numRows == 0) return l ;
        l.add(Arrays.asList(1));
        if(numRows == 1) return l ; 
        l.add(Arrays.asList(1,1)) ;
        if(numRows ==2 ) return l ;

        for(int i =3 ; i<=numRows ; i++){
           List<Integer> prev = l.get(i-2) ; 
           List<Integer> currow = new ArrayList<>();
           currow.add(1); 
           for(int j = 1 ; j< prev.size() ; j++){
             currow.add(prev.get(j-1)+prev.get(j)) ; 
           }
           currow.add(1);
           l.add(currow) ; 
        }
            return l; 
    }
}