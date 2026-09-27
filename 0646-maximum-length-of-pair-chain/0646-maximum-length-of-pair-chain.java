class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b)->Integer.compare(a[1], b[1]));
        int count=0;
        int lastend=Integer.MIN_VALUE;
        for(int[] p:pairs){
            int start=p[0];
            int end=p[1];
            if(start>lastend){
                count++;
                lastend=end;
            }
        }
        return count;
        
    }
}