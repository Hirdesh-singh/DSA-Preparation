class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n=points.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=points[i][0];
            int y=points[i][1];
            
            map.put(i,x*x + y*y);

        }
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->Long.compare(map.get(a), map.get(b)));
        for(int i=0;i<n;i++){
            q.offer(i);
        }
        int[][] result=new int[k][2];
        for(int i=0;i<k;i++){
            result[i]=points[q.poll()];
        }
        return result;

        
        
    }
}