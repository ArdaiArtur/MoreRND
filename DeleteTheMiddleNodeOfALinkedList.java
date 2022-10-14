/**
 * DeleteTheMiddleNodeOfALinkedList
 */
public class DeleteTheMiddleNodeOfALinkedList {

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null)
        return null;  
    var h1=head;
    var h2=head.next.next;
    while (h2!=null && h2.next!=null ) {
        h1=h1.next;
        h2=h2.next.next;
    }
    
    h1.next=h1.next.next;
    return head;
    }
}