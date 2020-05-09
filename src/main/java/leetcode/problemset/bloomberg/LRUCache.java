package leetcode.problemset.bloomberg;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	private Map<Integer, DataNode> lookupMap = new HashMap<>();
	private int capacity = 0;
	private int size = -1;

	/*
	 * These are pseudo front and tails. These nodes themselve do not represent
	 * actual data. Infact head node points to that node which acts as the logical
	 * head and similarly do tail
	 * 
	 */
	private DataNode front = new DataNode();
	private DataNode tail = new DataNode();

	public LRUCache(int capacity) {

		this.capacity = capacity;

		if (capacity <= 0) {
			throw new IllegalArgumentException("Capacity should be a positive integer");
		}

		front.next = tail;
		tail.previous = front;
	}

	public int get(int key) {

		DataNode node = lookupMap.get(key);

		if (node == null) {
			return -1;
		}

		removeNode(node);
		addNode(node);

		return node.value;
	}

	public void put(int key, int value) {

		DataNode node = lookupMap.get(key);

		if (node == null) {

			// create the new node
			DataNode newNode = new DataNode(key, value);

			if (size == capacity - 1) {
				// Reached cache max. Remove the least recently used data node
				DataNode deletedNode = popTail();
				lookupMap.remove(deletedNode.key);
				size--;
			}

			addNode(newNode);
			lookupMap.put(key, newNode);
			size++;
			return;
		}

		node.value = value;
		removeNode(node);
		addNode(node);
	}

	// Add the node to the logical front
	private void addNode(DataNode node) {

		node.previous = front;
		node.next = front.next;
		front.next.previous = node;

		front.next = node;
	}

	// Remove an exiting node in the lookupMap
	private void removeNode(DataNode node) {
		node.previous.next = node.next;
		node.next.previous = node.previous;
	}

	// Removes the logical tail
	private DataNode popTail() {

		DataNode tailNode = tail.previous;

		removeNode(tailNode);

		return tailNode;
	}

	// Resembles a doubly linked list, with a previous and next pointer.
	static class DataNode {

		private int key = 0;
		private int value = 0;

		private DataNode next;
		private DataNode previous;

		public DataNode() {

		}

		public DataNode(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

}
