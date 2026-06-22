class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> mapForS=new HashMap<>();
        HashMap<Character,Integer> mapForT=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            mapForS.putIfAbsent(s.charAt(i),0);
            mapForS.put(s.charAt(i),mapForS.get(s.charAt(i))+1);
            
            mapForT.putIfAbsent(t.charAt(i),0);
            mapForT.put(t.charAt(i),mapForT.get(t.charAt(i))+1);
        }
        boolean check=true;
        for(int i=0;i<s.length();i++){
            if(!mapForS.get(s.charAt(i)).equals(mapForT.get(s.charAt(i)))){
                check=false;
                break;
            }
        }
        return check;
    }
}
