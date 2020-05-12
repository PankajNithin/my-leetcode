package leetcode.cards.hashtables;

import java.util.LinkedList;

public class CustomHashMap {

	private static final int BUCKET_SIZE = 10;

	@SuppressWarnings("unchecked")
	private LinkedList<KeyValuePair>[] bucket = new LinkedList[BUCKET_SIZE];

	public void put(Integer key, Integer value) {

		int bucketIndex = getKeyIndex(key);
		KeyValuePair keyValuePair = new KeyValuePair(key, value);

		LinkedList<KeyValuePair> existingLinkedKeyValuePair = bucket[bucketIndex];

		if (existingLinkedKeyValuePair == null) {

			LinkedList<KeyValuePair> newLinkedKeyValuePair = new LinkedList<>();
			newLinkedKeyValuePair.add(keyValuePair);

			bucket[bucketIndex] = newLinkedKeyValuePair;
			return;
		}

		for (int index = 0; index < existingLinkedKeyValuePair.size(); index++) {

			if (existingLinkedKeyValuePair.get(index).getKey().equals(key)) {
				existingLinkedKeyValuePair.set(index, keyValuePair);
				return;
			}
		}

		existingLinkedKeyValuePair.add(keyValuePair);
	}

	public int get(Integer key) {

		LinkedList<KeyValuePair> linkedKeyValuePair = bucket[getKeyIndex(key)];
		int defaultMissingValue = -1;

		if (linkedKeyValuePair == null) {
			return defaultMissingValue;
		}

		for (int index = 0; index < linkedKeyValuePair.size(); index++) {

			if (linkedKeyValuePair.get(index).getKey().equals(key)) {
				return linkedKeyValuePair.get(index).getValue();
			}
		}

		return defaultMissingValue;
	}

	public void remove(int key) {

		LinkedList<KeyValuePair> linkedKeyValuePair = bucket[getKeyIndex(key)];

		if (linkedKeyValuePair == null) {
			return;
		}

		for (int index = 0; index < linkedKeyValuePair.size(); index++) {

			if (linkedKeyValuePair.get(index).getKey().equals(key)) {
				linkedKeyValuePair.remove(index);
				return;
			}
		}
	}

	private int getKeyIndex(Integer key) {
		return key.hashCode() % BUCKET_SIZE;
	}

	private static class KeyValuePair {

		private Integer key;
		private Integer value;

		public KeyValuePair(int key, int value) {
			this.key = key;
			this.value = value;
		}

		public Integer getKey() {
			return key;
		}

		public Integer getValue() {
			return value;
		}

	}

}
