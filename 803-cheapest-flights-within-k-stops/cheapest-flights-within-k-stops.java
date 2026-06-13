class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<int[]> graph[] = new ArrayList[n];
        for(int i =0 ; i<n ; i++){
            graph[i] = new ArrayList<>() ; 
        }

        for(int i = 0; i<flights.length ; i++){
            int from = flights[i][0] ;
            int to = flights[i][1];
            int cost = flights[i][2]; 

            graph[from].add(new int []{to,cost}) ;
        }

        int dist[] = new int[n] ;
        Arrays.fill(dist , Integer.MAX_VALUE) ; 

        dist[src] = 0; 
        int stops = 0 ; 

        Queue<int[]> q = new LinkedList<>() ; 
        q.offer(new int[] {src , 0}) ; 

        while(!q.isEmpty() && stops<=k){

            int size = q.size();
            int tempDist[] = dist.clone() ; 

            for(int i = 0; i<size ;i++){
                int curr[] = q.poll() ;

                int node = curr[0] ;
                int cost = curr[1] ;

                for(int edge[]:graph[node]){
                    int nb = edge[0] ;
                    int price = edge[1] ; 

                    if(cost + price < tempDist[nb]){
                        tempDist[nb] = cost+price ;
                        q.offer(new int []{nb , cost+price}) ; 
                    }
                }
            }
            dist = tempDist ;
            stops++; 
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst] ; 
    }
}