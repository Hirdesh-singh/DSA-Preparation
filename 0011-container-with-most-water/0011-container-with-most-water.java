class Solution {
    public int maxArea(int[] height) {
        
        int n=height.length;
        int l=0;
        int h=n-1;
        int best=0;
        while(l<h){
            int area=Math.min(height[h], height[l])*(h-l);
            best=Math.max(area, best);
            if(height[l]<height[h]){
                l++;
            }
            else{
                h--;
            }


        }
        return best;
        
    }
}