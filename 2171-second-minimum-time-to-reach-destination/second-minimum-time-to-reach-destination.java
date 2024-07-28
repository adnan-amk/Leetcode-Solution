class Solution {
    public int secondMinimum(int n, int[][] edges, int time, int change) {
      List<List<Integer>> adj=new ArrayList<>();//Adjacency List
      for(int i=0;i<n+1;i++){
        adj.add(new ArrayList<>());
      }

      for(int edge[]:edges){
        int a=edge[0],b=edge[1];
        adj.get(a).add(b);
        adj.get(b).add(a);
      }
    
        int timeTaken[][]=new int[n+1][2];
        for(int i=0;i<n+1;i++)
            Arrays.fill(timeTaken[i],Integer.MAX_VALUE);
        Queue<int[]> q=new LinkedList<>();
        timeTaken[1][0]=0;
        q.offer(new int[]{1,0});
        while(!q.isEmpty()){
            int ele[]=q.poll();
            int node=ele[0];
            int curTime=ele[1];
            if(node==n){
                if(timeTaken[node][1]!=Integer.MAX_VALUE){
                    break;
                }
            }
        if((curTime/change)%2!=0){
            int waitTime=change-(curTime%change);
            curTime+=waitTime+time;
        }else{
            curTime+=time;
        }
        for(int neighbor:adj.get(node)){
            if(timeTaken[neighbor][0]==Integer.MAX_VALUE){
                timeTaken[neighbor][0]=curTime;
                q.offer(new int[]{neighbor,curTime});
            }
            else if(timeTaken[neighbor][1]==Integer.MAX_VALUE && curTime>timeTaken[neighbor][0]){
                timeTaken[neighbor][1]=curTime;
                q.offer(new int[]{neighbor,curTime});
            }
        }
        }
        return timeTaken[n][1];
    }
}