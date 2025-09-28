/* 
 Given the root of a binary tree, return it's maximum depth.
 
 A binary tree's maximum depth is the number of nodes along the longest path from the root 
 node down to the farthest leaf node.
*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { 
        val = x; 
    }
}

public class Problem6 {

        public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(8);
        root.right = new TreeNode(17);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(19);
	root.right.right.left = new TreeNode(16);
	root.right.right.left.left = new TreeNode(9);
        Problem6 obj = new Problem6();
        System.out.println(obj.maxDepth(root));
    }
}
