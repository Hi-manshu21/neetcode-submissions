class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length){
            return nums;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] array = new int[k];
       
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> map.get(a) - map.get(b));

        for(int n : map.keySet()){
            pq.add(n);
            if(pq.size() > k){
                pq.poll();
            }
        }

        for(int i=0;i<k;i++){
            array[i] = pq.remove();
        }
        return array;
    }
}
