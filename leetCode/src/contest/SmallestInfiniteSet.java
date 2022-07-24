package contest;

import java.util.TreeSet;

public class SmallestInfiniteSet {
	TreeSet<Integer> set;
	
    public SmallestInfiniteSet() {
        set = new TreeSet<Integer>();
        for (int i = 1; i < 1010; i++) {
			set.add(i);
		}
    }
    
    public int popSmallest() {
    	return set.pollFirst();
    }
    
    public void addBack(int num) {
    	set.add(num);
    }
}
