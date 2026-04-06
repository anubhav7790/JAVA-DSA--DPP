class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l = new ArrayList<>();
        l.add(1); 
        if(rowIndex == 0) return l ; 
        l = new ArrayList<>(); 
        l.add(0 ,1) ;
        l.add(1 , 1) ;
        if(rowIndex == 1) return l ; 
        List<Integer> prev = l ; 
        for(int i=2 ; i<= rowIndex ; i++){
           List<Integer> currow = new ArrayList<>(); 
           currow.add(1); 
           for(int j =1 ; j<prev.size() ; j++){
            currow.add(prev.get(j-1)+ prev.get(j)) ; 
           }
           currow.add(1); 
           prev = currow ; 
        }
        return prev ; 
    }
}