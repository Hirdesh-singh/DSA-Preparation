class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int m:nums){
            map.put(m, map.getOrDefault(m,0)+1);
        }
        for(int m:nums){
            if(map.get(m)>n/2){
                return m;
            }
        }
        return -1;
        
    }
}