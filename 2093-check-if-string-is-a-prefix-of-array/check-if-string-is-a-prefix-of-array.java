class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            sb.append(w);
            if (sb.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }
}
