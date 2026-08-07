class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> check = new HashMap<>();
        for (String i:strs) {
            int[] count = new int[26];
            for (char j : i.toCharArray()) {
                count[j-'a']++;
            }
            String key = Arrays.toString(count);
            check.putIfAbsent(key, new ArrayList<>());
            check.get(key).add(i);
        }
        return new ArrayList<>(check.values());
    }
}
