class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a, map.getOrDefault(a,0)+1);
        }
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));
        for(int x:map.keySet()){
            q.offer(x);

        }
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=q.poll();

        }
        return arr;

        
        
        
      
        
        

        
    }
}