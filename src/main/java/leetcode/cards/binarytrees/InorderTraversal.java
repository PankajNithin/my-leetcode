package leetcode.cards.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

	public List<Integer> solution(TreeNode node) {

		Stack<TreeNode> nodeStack = new Stack<>();
		List<Integer> result = new ArrayList<>();

		while (node != null || !nodeStack.isEmpty()) {

			while (node != null) {
				nodeStack.push(node);
				node = node.leftChild;
			}

			TreeNode currentNode = nodeStack.pop();
			result.add(currentNode.val);

			node = currentNode.rightChild;
		}

		return result;
	}

}
