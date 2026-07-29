class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> val = new HashSet<>();
        int count = 0;
        int left = 0; 
        
        for (int i=0; i<s.length(); i++) {
            while (val.add(s.charAt(i))==false) {
                val.remove(s.charAt(left));
                left++;
            }
            val.add(s.charAt(i));
            count = Math.max(count, i - left + 1);
        }
        return count;
    }
}
