// 101. Symmetric Tree
// 6 ms, faster than 94.53% of java submissions
// 29.3 MB, less than 1.58% of java online submissions

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetricHelper(root.left, root.right);
    }
    
    public boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if ((left != null && right == null) || (left == null && right != null)) {
            return false;
        } else{
            if (left.val == right.val) {
                return isSymmetricHelper(left.left, right.right) &&
                    isSymmetricHelper(left.right, right.left);
            } else {
                return false;
            }
        }
    }
}