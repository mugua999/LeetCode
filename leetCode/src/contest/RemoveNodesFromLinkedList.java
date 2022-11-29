package contest;

import java.util.ArrayList;
import java.util.List;

public class RemoveNodesFromLinkedList {
	public ListNode solution(ListNode head) {
		List<ListNode> list = new ArrayList<>();
		
		while(head != null) {
			list.add(head);
			head = head.next;
		}
		
		int pointer = 1;
		
		while (list.size() - pointer > 0) {
			if (list.get(list.size() - pointer).val > list.get(list.size() - pointer - 1).val) {
				list.remove(list.size() - pointer - 1);
			} else pointer++;
		}
		
		for (int i = 0; i < list.size() - 1; i++) {
			list.get(i).next = list.get(i + 1);
		}
		
		return list.get(0);
	}
}
