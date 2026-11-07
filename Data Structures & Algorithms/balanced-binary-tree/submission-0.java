/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    boolean balance = true;
    public boolean isBalanced(TreeNode root) {
        // 左右子樹深度相差小於等於1 true else false
        depth(root);
        return balance;

    }

        private int depth (TreeNode node) {
            if (node == null) {
                return 0;
            }

            int lDepth= depth(node.left);
            int rDepth= depth(node.right);

            if (Math.abs(lDepth - rDepth) > 1) {
                balance = false;
            }
            return 1 + Math.max(lDepth, rDepth);
        }
}
