package leetcode.cards.hashtables;

public class CustomHashSet {

	private static final int BUCKET_SIZE = 10;

	private DataNode[] dataNodes = new DataNode[BUCKET_SIZE];

	public void add(Integer val) {

		if (contains(val)) {
			return;
		}

		DataNode newNode = new DataNode(val);
		int targetIndex = getInternalIndex(val);

		if (dataNodes[targetIndex] == null) {
			dataNodes[targetIndex] = newNode;
			return;
		}

		appendAtNodeEnd(targetIndex, newNode);
	}

	public void remove(Integer val) {

		if (!contains(val)) {
			return;
		}

		DataNode currentNode = dataNodes[getInternalIndex(val)];

		if (currentNode.value == val) {
			dataNodes[getInternalIndex(val)] = null;
			return;
		}

		DataNode tempNode = currentNode;

		while (tempNode.nextNode != null && tempNode.nextNode.value != val) {
			tempNode = tempNode.nextNode;
		}

		if (tempNode.nextNode != null) {
			tempNode.nextNode = tempNode.nextNode.nextNode;
		}
	}

	private void appendAtNodeEnd(int index, DataNode newNode) {

		DataNode currentNode = dataNodes[index];

		while (currentNode.nextNode != null) {
			currentNode = currentNode.nextNode;
		}

		currentNode.nextNode = newNode;
	}

	public boolean contains(Integer val) {

		int index = getInternalIndex(val);

		if (dataNodes[index] == null) {
			return false;
		}

		DataNode currentNode = dataNodes[index];

		while (currentNode != null) {

			if (currentNode.value == val) {
				return true;
			}

			currentNode = currentNode.nextNode;
		}

		return false;
	}

	private int getInternalIndex(Integer val) {
		return val.hashCode() % BUCKET_SIZE;
	}

	private static class DataNode {

		private Integer value;
		private DataNode nextNode;

		public DataNode(Integer value) {
			this.value = value;
		}
	}

}
