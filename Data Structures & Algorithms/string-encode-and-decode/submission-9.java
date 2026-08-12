class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for (String i:strs) {
            str.append(i.length()).append("#").append(i);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> l_strs = new ArrayList<>();
        int i = 0;
        while (i<str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int l = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + l;
            l_strs.add(str.substring(i, j));
            i = j;
        }
        return l_strs;
    }
}
