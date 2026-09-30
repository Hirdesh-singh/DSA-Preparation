class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        boolean[] vis=new boolean[nums.length];
        bt(vis, nums, res, path);

        
        
        return res;
        
    }
    public void bt(boolean[] vis, int[] nums, List<List<Integer>> res, List<Integer> path){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;

        }
        
        for(int i=0;i<nums.length;i++){
            if(vis[i]) continue;
            vis[i]= true;
            path.add(nums[i]);
            bt(vis, nums, res, path);
            path.remove(path.size()-1);
            vis[i]=false;
        }
        
    }
}