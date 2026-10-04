class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        boolean[] used=new boolean[strs.length];
        
        for(int i=0;i<strs.length;i++){
            if(used[i]){
                continue;
            }

            List<String> ans=new ArrayList<>();
            ans.add(strs[i]);
            used[i]=true;
            for(int j=i+1;j<strs.length;j++){
                

                if(!used[j] && anagram(strs[i], strs[j])){
                    ans.add(strs[j]);
                    used[j]=true;
                }
                
            }
            res.add(ans);
        }
        return res;
        
    }
    public boolean anagram(String s, String t){
        if(s.length() !=t.length()){
            return false;
        }
        char[] c=s.toCharArray();
        char[] k=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(k);
        if(Arrays.equals(c,k)){
            return true;
        }
        return false;
    }
}