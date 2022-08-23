public class PalidromeLinkedList {
    public boolean isPalindrome(ListNode head) {
       
         ListNode curr=head;
         ListNode prev=null;
         ListNode next=null;
        var man=head;
        int n=0; 
        if(head == null || head.next == null){
            return true;
        }
        while(man!=null&&man.next!=null)
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
