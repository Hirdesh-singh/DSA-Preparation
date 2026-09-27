class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        
        int count=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i, isConnected, vis);
                count++;
            }
        }
        return count;
    }
    public void dfs(int start, int[][] isConnected, boolean[] vis){
        vis[start]=true;
        int n=isConnected.length;
        for(int j=0;j<n;j++){
                int nums=isConnected[start][j];
                if(nums==1 && !vis[j]){
                    dfs(j, isConnected, vis);
                }
            }
    }
}