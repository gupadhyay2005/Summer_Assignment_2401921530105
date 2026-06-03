class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int start = 0, end = len - 1;
        for (int i = len - 1; i >= 0; i--) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                ans[i] = nums[start] * nums[start];
                start++;
            } else {
                ans[i] = nums[end] * nums[end];
                end--;
            }
        }
        return ans;
    }
}
