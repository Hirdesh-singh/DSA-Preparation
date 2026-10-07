class Solution {
    public String minWindow(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(n>m) return "";
        int[] freq=new int[128];
        for(char c:t.toCharArray()){
            freq[c]++;
        } 
        int left=0;
        int start=0;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<m;i++){
            char ch=s.charAt(i);
            if(freq[ch]>0){
                n--;
            }
            freq[ch]--;
            while(n==0){
                if(i-left+1<min){
                    min=i-left+1;
                    start=left;
                }
                char leftchar=s.charAt(left);
                freq[leftchar]++;
                if(freq[leftchar]>0){
                    n++;
                }
                left++;

            }


        }
        if(min==Integer.MAX_VALUE) return "";
        return s.substring(start, start+min);
        
    }
}