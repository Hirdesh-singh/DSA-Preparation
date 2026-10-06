class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=numbers.length;
        for(int i=0;i<n;i++){
            int req=target-numbers[i];
            if(map.containsKey(req)){
                return new int[]{map.get(req)+1, i+1};
                
            }
            map.put(numbers[i], i);
        }
        return new int[]{};
        
    }
}