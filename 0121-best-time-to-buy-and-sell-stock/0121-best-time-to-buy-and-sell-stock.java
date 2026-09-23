class Solution {
    public int maxProfit(int[] prices) {
        int minp=Integer.MAX_VALUE;
        int p=0;
        for(int i=0;i<prices.length;i++){
            minp=Math.min(minp, prices[i]);
            p=Math.max(p, prices[i]-minp);
        }
        return p;
        
    }
}