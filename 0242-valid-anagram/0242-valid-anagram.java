class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        }
        char[] a=s.toCharArray();
        char[] m=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(m);
        return Arrays.equals(a,m);
        
    }
}