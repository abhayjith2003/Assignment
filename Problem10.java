/* 
 Given  a binary tree, find it's minimum depth.
 The minimum depth is the number of nodes along the shortest path from the root node 
 down to the nearest leaf node.
*/


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Problem10 {

    public int minDepth(TreeNode root) {
        if (root == null) return 0; 
        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
	root.right.right.left = new TreeNode(6);
	root.right.right.right = new TreeNode(13);

        Problem10 obj = new Problem10();
        System.out.println(obj.minDepth(root)); 
    }
}
