class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        Set<Character> val = new HashSet<>();

            // xyzxyz 
       
        for (int i=0; i<s.length(); i++) {
            for (int j=i; j<s.length(); j++) {
                if (val.add(s.charAt(j))==false) {
                    count = Math.max(count,val.size());
                        val.clear();
                        break;
                    }
                }
            }
        
        return Math.max(count,val.size());
    }
}
