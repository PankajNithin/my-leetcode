package leetcode.cards.apple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonRepeatingLongestSubstringTest {

	private NonRepeatingLongestSubstring obj;

	@Before
	public void Setup() {
		obj = new NonRepeatingLongestSubstring();
	}

	@Test
	public void Test1() {

		int result = obj.solution("abcabcbb");

		Assert.assertEquals(3, result);
	}

	@Test
	public void Test2() {

		int result = obj.solution("bbbbbbb");

		Assert.assertEquals(1, result);
	}

	@Test
	public void Test3() {

		int result = obj.solution("pwwkew");

		Assert.assertEquals(3, result);
	}
}
