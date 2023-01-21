class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int st : stones){
            pq.add(st);
        }
        while(pq.size() > 1){
            int st1 = pq.poll();
            int st2 = pq.poll();
            if(st1 > st2){
                pq.add(st1 - st2);
            }
            
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}