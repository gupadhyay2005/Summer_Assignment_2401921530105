class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int l = s.length();

        for (int i = 1; i <= l / 2; i++) {

            if (l % i != 0) {
                continue;
            }

            String p = s.substring(0, i);
            StringBuilder str = new StringBuilder();

            int c = l / i;

            for (int j = 0; j < c; j++) {
                str.append(p);
            }

            if (str.toString().equals(s)) {
                return true;
            }
        }

        return false;
    }
}
