package leetcode.cards.binarytrees;

/*
 * A very basic Binary Tree representation
 * 
 */

public class TreeNode {

	int val;
	TreeNode leftChild;
	TreeNode rightChild;

	public TreeNode() {
		// No Args
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode leftChild, TreeNode rightChild) {
		this.val = val;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

}
