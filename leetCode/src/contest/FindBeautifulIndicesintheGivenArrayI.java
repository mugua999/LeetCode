package contest;

import java.util.ArrayList;
import java.util.List;

public class FindBeautifulIndicesintheGivenArrayI {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> beautifulIndices = new ArrayList<>();
        List<Integer> aIndices = findIndices(s, a);
        List<Integer> bIndices = findIndices(s, b);

        for (int i : aIndices) {
            for (int j : bIndices) {
                if (Math.abs(i - j) <= k) {
                    beautifulIndices.add(i);
                    break; // No need to check further once a matching index is found
                }
            }
        }

        return beautifulIndices;
    }
    
    private List<Integer> findIndices(String s, String sub) {
        List<Integer> indices = new ArrayList<>();
        int index = s.indexOf(sub);
        while (index >= 0) {
            indices.add(index);
            index = s.indexOf(sub, index + 1);
        }
        return indices;
    }
}
