package contest;

public class ReverseOddLevelsofBinaryTree {
    /*public TreeNode reverseOddLevels(TreeNode root) {
        int level = 0, n = 0, no = 0;
        
        
    }*/
    
    private void swap(TreeNode node1, TreeNode node2) {
    	TreeNode temp = new TreeNode();
    	temp = node1;
    	node1 = node2;
    	node2 = temp;
    }
}
