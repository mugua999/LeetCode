

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddTwoNum {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(9,9,9,9,9,9,9));
		LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(9,9,9,9));
		System.out.println(addTwoNumbers(l1,l2));
	}
	
	public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> ans = new LinkedList<>();
        
        int maxLength = Math.max(l1.size(), l2.size());
        System.out.println("max length = " + maxLength);
        if (l1.size() < maxLength) {
        	for (int i = 0; i < maxLength - l1.size(); i++) {
        		l1.add(0);
        	}
        }else if (l2.size() < maxLength) {
        	System.out.println("length diff is " + (maxLength - l2.size()));
        	for (int i = 0; i < (maxLength + 100 - l2.size()); i++) {
        		l2.add(0);
        		System.out.println("l2 size +1");
        	}
        }
        
        for (int i = 0; i < maxLength; i++) {
        	int result = l1.get(i) + l2.get(i);
        	
        	if(result >= 10) {
        		ans.add(result % 10);
        		if (i == maxLength-1) {
        			ans.add(1);
        			System.out.println("at the end, extend 1");
        		}else {
        			l1.set(i+1, l1.get(i+1)+1);
        			//System.out.print("up 1 " + l1 + "\n");
        		}
        	}else {
        		ans.add(result);
        	}
        }
        
        return ans;
    }
}
 