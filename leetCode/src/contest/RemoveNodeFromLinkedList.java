package contest;

public class RemoveNodeFromLinkedList {
    public ListNode removeNodes(ListNode head) {
    	ListNode dummy = new ListNode();
    	dummy.next = head;
    	
        while (head.next != null) {
        	if (head.next.val > head.val) {
        		head = head.next;
        	}
        }
    }
}
