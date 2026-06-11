class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve(n, 0, 0, "", result);
        return result;
    }

    void solve(int n, int open, int close,
               String temp, List<String> result) {

        // ✅ base case
        if (temp.length() == 2 * n) {
            result.add(temp);
            return;
        }

        // ✅ add '(' if we can
        if (open < n) {
            solve(n, open + 1, close, temp + "(", result);
        }

        // ✅ add ')' if valid
        if (close < open) {
            solve(n, open, close + 1, temp + ")", result);
        }
    }
}
