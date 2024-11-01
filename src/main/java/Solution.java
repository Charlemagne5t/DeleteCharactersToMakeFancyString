class Solution {
    public String makeFancyString(String s) {
        int c = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                if (c == 2) {
                    continue;
                } else {
                    c++;
                    sb.append(s.charAt(i));
                }
            } else {
                c = 1;
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}