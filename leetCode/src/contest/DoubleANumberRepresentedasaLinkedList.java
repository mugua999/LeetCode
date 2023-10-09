package contest;

import java.util.LinkedList;
import java.util.List;

public class DoubleANumberRepresentedasaLinkedList {
	
	public static void main(String[] args) {
		
	}
	
    public ListNode doubleIt(ListNode head) {
        String numStr = "";
        
        while(head != null) {
        	numStr += head.val;
        	head = head.next;
        }
        
        int num = Integer.parseInt(numStr);
        int doubled = 2 * num;
        
        String doubledStr = Integer.toString(doubled);
        
        List<Integer> list = new LinkedList<>();
        
        for (int i = 1; i < doubledStr.length(); i++) {
			list.add(Character.getNumericValue(doubledStr.charAt(i)));
		}
        
        
        
        return null;
    }
}
