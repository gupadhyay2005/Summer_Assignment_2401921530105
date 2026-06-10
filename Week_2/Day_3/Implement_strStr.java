class Solution {
    public int strStr(String haystack, String needle) {

        for (int start = 0; start <= haystack.length() - needle.length(); start++) {

            int ptr = 0;

            while (ptr < needle.length() &&
                   haystack.charAt(start + ptr) == needle.charAt(ptr)) {
                ptr++;
            }

           a if (ptr == needle.length()) {
                return start;
            }
        }

        return -1;
    }
}
