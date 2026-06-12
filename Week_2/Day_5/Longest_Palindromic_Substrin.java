class Solution {

    public String longestPalindrome(String str) {

        if (str.length() <= 1) {
            return str;
        }

        String lps = "";

        for (int i = 0; i < str.length(); i++) {

    
            int low = i;
            int high = i;

            while (low >= 0 &&
                   high < str.length() &&
                   str.charAt(low) == str.charAt(high)) {

                low--;
                high++;
            }

            String palindrome = str.substring(low + 1, high);

            if (palindrome.length() > lps.length()) {
                lps = palindrome;
            }

        
            low = i;
            high = i + 1;

            while (low >= 0 &&
                   high < str.length() &&
                   str.charAt(low) == str.charAt(high)) {

                low--;
                high++;
            }

            palindrome = str.substring(low + 1, high);

            if (palindrome.length() > lps.length()) {
                lps = palindrome;
            }
        }

        return lps;
    }
}
