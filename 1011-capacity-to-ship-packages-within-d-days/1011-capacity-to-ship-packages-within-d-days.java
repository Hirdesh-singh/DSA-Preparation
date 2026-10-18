class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int l=0;
        int r=0;
        for(int w:weights){
            l=Math.max(l,w);
            r +=w;

        }
        while(l<=r){
            int mid=l+(r-l)/2;
            int d=day(weights, mid);
            if(d<=days){
                r=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return l;
        
    }
    public int day(int[] weights, int m){
        int totald=1;
        int load=0;
        for(int w:weights){
            if(load+ w>m){
                totald++;
                load=w;
            }
            else{
                load+=w;
            }
        }
        return totald;
    }
}