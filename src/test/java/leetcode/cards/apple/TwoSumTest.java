package leetcode.cards.apple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {

	private TwoSum twoSum;

	@Before
	public void Setup() {
		twoSum = new TwoSum();
	}

	@Test
	public void Test1() {

		int[] inputArray = new int[] { 2, 7, 11, 15 };
		int target = 9;

		int[] result = twoSum.solution(inputArray, target);
		int[] expected = new int[] { 0, 1 };

		Assert.assertArrayEquals(expected, result);
	}

	@Test
	public void Test2() {

		int[] inputArray = new int[] { 1, 7, 11, 9 };
		int target = 10;

		int[] result = twoSum.solution(inputArray, target);
		int[] expected = new int[] { 0, 3 };

		Assert.assertArrayEquals(expected, result);
	}

}
