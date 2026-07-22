class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] map=new int[26];  
        HashSet<String> wor=new HashSet<>();
        List<List<String>> ans= new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            List<String> res= new ArrayList<>();
            char[] chars=strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedStr=new String(chars);
            if(wor.contains(sortedStr)){
                continue;
            }else{
                wor.add(sortedStr);
                res.add(strs[i]);
            }
            for(int j=i+1;j<strs.length;j++){
                char[] charsj=strs[j].toCharArray();
                Arrays.sort(charsj);
                String sortedStrj=new String(charsj);
                if (sortedStr.equals(sortedStrj)){
                    res.add(strs[j]);
                }
            }
            ans.add(res);
        }
        return ans;
    }
}
