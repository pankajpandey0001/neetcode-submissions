class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> s_count = new HashMap<>();
        Map<Character, Integer> t_count = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            s_count.put(s.charAt(i), s_count.getOrDefault(s.charAt(i), 0)+1);
            t_count.put(t.charAt(i), t_count.getOrDefault(t.charAt(i), 0)+1);
        }
        return s_count.equals(t_count);
    }
}