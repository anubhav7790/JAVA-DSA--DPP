class Solution {
    public String simplifyPath(String path) {
        String arr[] = path.split("/") ; 
        Stack<String> s = new Stack<>() ; 
        for(String c : arr){
            if(c.equals(".")|| c.equals("")) continue ; 
            else if(c.equals("..")){
                if(!s.isEmpty())  s.pop() ;
               
            } 
            else s.push(c); 
        }
        StringBuilder s1 =new StringBuilder() ; 
        for(String dir : s ){
            s1.append("/").append(dir) ; 
        }

        return s1.length()==0 ?"/" : s1.toString() ; 
    }
}