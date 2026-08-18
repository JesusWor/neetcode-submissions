class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            if(!mp.containsKey(sortedKey)){
                mp.put(sortedKey, new ArrayList<>());
            }
            mp.get(sortedKey).add(s);
        } 
        return new ArrayList<>(mp.values());
    }
}
