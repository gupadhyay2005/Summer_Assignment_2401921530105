class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 =list1;
        ListNode temp2 = list2;
        if(list1 ==null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        ListNode mergedll = new ListNode(-1);
        ListNode x =mergedll;
        while(temp1!= null && temp2!= null){
            if(temp1.val<= temp2.val){
            x.next =temp1;
            temp1= temp1.next;
            
            }else{
                x.next =temp2;
                 temp2= temp2.next;
            }
            x=x.next;
        }
        if(temp1!= null){
        x.next=temp1;
        }
        if(temp2!=null){
            x.next=temp2;
        }
           
           return mergedll.next;
   
    }
}

       
 
