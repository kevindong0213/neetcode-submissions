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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new  ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> que = new ArrayDeque<>();
        que.offer(root);
        while (!que.isEmpty()) {
            int levelSize = que.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0;i<levelSize;i++) {
                TreeNode node = que.poll();
                level.add(node.val);
                
        
        if(node.left != null) {que.offer(node.left);}
        if(node.right != null) {
            que.offer(node.right);
        }

    }
    res.add(level);
}
return res;
}
}