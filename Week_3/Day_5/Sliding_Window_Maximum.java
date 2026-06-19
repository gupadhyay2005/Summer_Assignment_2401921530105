class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq = new LinkedList<>();
        int n =nums.length;
        for( int i = 0 ; i< k ; i++){
            while(!dq.isEmpty()  &&  nums[dq.peekLast()] <= nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        int ans[] = new int[n-k+1];
        int x = 0;
        for( int i = k ;i< n ; i++){
       ans[x++] =nums[dq.peekFirst()];


       while(!dq.isEmpty()  && dq.peekFirst() <= i-k){
        dq.removeFirst();
       }
       while(!dq.isEmpty()  &&   nums[dq.peekLast()]<= nums[i]){
        dq.removeLast();
       }
       dq.addLast(i);

        }
        ans[x] = nums[dq.peekFirst()];
        return ans;
    }
}
