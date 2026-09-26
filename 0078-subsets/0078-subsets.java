class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> res=new ArrayList<>();
       List<Integer> path=new ArrayList<>();
       back(0,  path, nums, res);
       return res;
       
        
    }
    public void back(int start, List<Integer> path, int[] nums, List<List<Integer>> res){
         res.add(new ArrayList<>(path));
         for(int i=start;i<nums.length;i++){
             path.add(nums[i]);
             back(i+1, path,nums,res);
             path.remove(path.size()-1);
         }
    }
}