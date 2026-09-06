class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>(); 
        for(int a : asteroids){
            while(!s.isEmpty() && a < 0 && s.peek() > 0){
                int sum = a + s.peek() ;

                if(sum < 0){
                    s.pop();
                }
                else if(sum > 0) a=0; 
                else{
                    s.pop(); 
                    a=0 ; 
            }
        }
           if(a!=0) s.push(a); 

        }
        
        int  ans[] = new int[s.size()]; 
       
        for (int i = 0; i < ans.length; i++) {
            ans[i] = s.get(i);
        }

        return ans;
        
    }
}