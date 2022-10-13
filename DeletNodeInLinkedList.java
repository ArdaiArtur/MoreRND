public class DeletNodeInLinkedList {
    public static void deletNode(ListNode node)
    {
        var nd=node.next;
        node.val=nd.val;
        node.next=nd.next;
        nd.next=null;
        /* 
        while (node.next.next!=null) {
            node.val=node.next.val;
            node=node.next;
        }
        node.val=node.next.val;
        node.next=node.next.next;
    */
    }
}
