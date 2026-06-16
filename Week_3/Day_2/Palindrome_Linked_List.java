
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
         ListNode curr = mid;
ListNode next;
ListNode prev = null;
while(curr!=null){
    next = curr.next;
curr.next = prev;
prev =curr;
curr = next;
}
ListNode right = prev;
ListNode left = head;

while(right!= null){
    if(left.val != right.val ){
        return false;
    }
    left  = left.next;
    right = right.next;
}
return true;

        
    }
    public   ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;       // move 1 step
            fast = fast.next.next; // move 2 steps
        }

        return slow;
    }

}
