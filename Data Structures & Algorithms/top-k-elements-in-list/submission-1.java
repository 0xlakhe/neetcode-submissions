class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            map.putIfAbsent(num,0);
            map.put(num,map.get(num)+1);
        }
        PriorityQueue<Integer> pg=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int num:map.keySet()){
            pg.offer(num);
            if (pg.size()>k){
                pg.poll();
            }
        }
        int[] ans= new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pg.poll();
        }
        return ans;
    }
}
