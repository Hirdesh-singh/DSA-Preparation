class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int l=1;
        int max=0;
        for(int pil:piles){
             max=Math.max(max,pil);
        }
        while(l<=max){
            int mid=(max+l)/2;
            int a=hour(piles, mid);
            if(a<=h){
                max=mid-1;

            }
            else{
                l=mid+1;
            }


            
        }
        return l;
        
    }
    public int hour(int[] piles, int h){
        int totalh=0;
        for(int i=0;i<piles.length;i++){
            totalh += Math.ceil((double)piles[i]/(double) h);
        }
        return totalh;
    }
}