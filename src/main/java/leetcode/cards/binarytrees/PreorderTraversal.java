package leetcode.cards.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

//Given a root node of a binary tree perform a preorder traversal

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

public class PreorderTraversal {
	
	public List<Integer> solution(TreeNode node) {
		
		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> rightNodes = new Stack<>();
		
		while(node != null) {
			
			result.add(node.val);
			
			if(node.rightChild != null) {
				rightNodes.push(node.rightChild);
			}
			
			node = node.leftChild;
			
			if(node == null && !rightNodes.isEmpty()) {
				node = rightNodes.pop();
			}
		}
		
		return result;
	}

}
