class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for (String word: strs){
            sb.append(word.length());
            sb.append("#");
            sb.append(word);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        int index=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)=='#' && Character.isDigit(str.charAt(i-1))){
                int length=Integer.parseInt(str.substring(index,i));
                String ans=str.substring(i+1,i+1+length);
                res.add(ans);
                i+=length;
                index=i+1;
            }
        }
        return res;
    }
}
