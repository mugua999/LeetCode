package contest;

import java.util.List;

public class ListNode {
	int val;
	ListNode next;

	ListNode(List<Integer> list) {
		this.val = list.get(0);
		int pointer = 1;
		ListNode dummy = new ListNode();
		dummy.next = this;
		while(pointer < list.size()) {
			dummy.next.next = new ListNode(list.get(pointer));
			dummy.next = dummy.next.next;
			pointer++;
		}
	}

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
