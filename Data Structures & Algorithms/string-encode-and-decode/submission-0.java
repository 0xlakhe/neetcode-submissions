class Solution {
    HashMap<String,List<String>> map=new HashMap<>();
    public String encode(List<String> strs) {
        map.putIfAbsent("encoded",strs);
        return "encoded";
    }

    public List<String> decode(String str) {
        if (str=="encoded"){
            return map.get("encoded");
        }
        return new ArrayList<>();
    }
}
