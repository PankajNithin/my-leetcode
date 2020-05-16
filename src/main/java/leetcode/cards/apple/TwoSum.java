package leetcode.cards.apple;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * 
 * Given nums = [2, 7, 11, 15], target = 9 -> Ans [0,1]
 */

public class TwoSum {

	public int[] solution(int[] inputArray, int target) {

		Map<Integer, Integer> arrayMap = new LinkedHashMap<Integer, Integer>();
		int[] result = new int[2];
		int startIndex = -1;

		for (int num : inputArray) {

			++startIndex;

			int find = target - num;

			if (arrayMap.containsKey(find)) {
				result[0] = arrayMap.get(find);
				result[1] = startIndex;

				return result;
			}

			arrayMap.put(num, startIndex);
		}

		return result;
	}

}
