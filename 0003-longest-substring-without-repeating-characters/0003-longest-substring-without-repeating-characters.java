class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int best=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            best=Math.max(best, i-l+1);
        }
        return best;

       
        
    }
}