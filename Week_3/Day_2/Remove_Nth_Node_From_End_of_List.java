
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size =0;
        while(temp!= null){
            size++;
            temp = temp.next;
        }
        if(size==0 || size==1){
            return null;
        }
        if(n ==size){
            return head.next;
        }
        int x = size-n;
        ListNode temp1 = head;
        
        int y=1;
        while(y!=x){
            
            temp1=temp1.next;
            y++;
        }
       


       temp1.next=temp1.next.next;
       

        return head;
    }
}
