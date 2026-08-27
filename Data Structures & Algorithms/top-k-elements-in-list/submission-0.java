class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        List<Integer>[] freq = new List[nums.length + 1];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }
        
        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            freq[frequency].add(num);
        }

        int[] res = new int[k];
        int idx = 0;

        for(int i=freq.length-1; i>0 && idx<k; i--){
            for(int num : freq[i]){
                res[idx++] = num;
                if(idx == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
