public class PalidromeLinkedList {
    public boolean isPalindrome(ListNode head) {
         ListNode prev=null;
         ListNode next=null;
         ListNode curr=head;
         ListNode man=head;
        
            int n=0; 
       
        while(man!=null)
        {
            n++;
            man=man.next;
        }
       int mid=n/2;
       while (mid!=0) {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        mid--;
       }
       if(n%2!=0)
       curr=curr.next;
       while (curr!=null) {
        if(prev.val!=curr.val)
        return false;
        curr=curr.next;
        prev=prev.next;
       }
       return true;
       
    }
}
