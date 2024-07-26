class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
            dist[i][i]=0;
        }

        for(int[] edge: edges){
            int node1=edge[0],node2=edge[1],distance=edge[2];
            dist[node1][node2]=distance;
            dist[node2][node1]=distance;
        }

        for(int midle=0;midle<n;midle++){
            for(int src=0; src<n; src++ ) {
                for(int dest=0;dest<n;dest++){
                    if(dist[src][midle]<Integer.MAX_VALUE && dist[midle][dest]<Integer.MAX_VALUE)
                    {   dist[src][dest]=Math.min(
                            dist[src][dest],dist[src][midle]+dist[midle][dest]
                        );
                    }
                }
            }
        }
        int min_no=n;
        int res=-1;

        for(int src=0;src<n;src++){
            int src_count=0;
            for(int dest=0;dest<n;dest++){
                if(dist[src][dest]<=distanceThreshold)
                    src_count++;
            }
            if(src_count<=min_no){
                min_no=src_count;
                res=src;
            }
        }
        return res;
    }
}