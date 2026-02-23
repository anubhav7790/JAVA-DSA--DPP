class Solution {
    public int firstUniqChar(String s) {
        int count [] = new int[26]; 
        Queue <Character> q = new LinkedList<>(); 
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i); 
            q.add(ch); 
            count[ch-'a']++; 
            while(!q.isEmpty() && count[q.peek()-'a']>1){
                q.remove() ; 
            }
        }
        if(q.isEmpty()) return -1 ;
         
        else{
           return s.indexOf(q.peek());  
        }
    }
}