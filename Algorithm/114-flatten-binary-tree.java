// 114. Flatten Binary Tree to Linked List
// 7 ms, faster than 89.76% of Java submissions
// 27.2 MB, less than 33.99% of Java submissions

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
  public void flatten(TreeNode root) {
    if (root == null) {
      return;
    }
    
    TreeNode left = root.left;
    TreeNode right = root.right;
    
    if (left != null) {
      flatten(left);
      root.right = left;
      root.left = null;
      while (root.right != null) {
        root = root.right;
      }
      
      root.right = right;
    }
    
    if (right != null) {
      flatten(right);  
    }
  }
}