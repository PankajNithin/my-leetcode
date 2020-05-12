package leetcode.cards.hashtables;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomHashSetTest {

	private CustomHashSet customHashSet;

	@Before
	public void Setup() {
		customHashSet = new CustomHashSet();
	}

	@Test
	public void Test1() {

		customHashSet.add(1);
		customHashSet.add(2);

		Assert.assertTrue(customHashSet.contains(1));
		Assert.assertFalse(customHashSet.contains(3));

		customHashSet.remove(2);
		Assert.assertFalse(customHashSet.contains(2));

		customHashSet.add(4);
		Assert.assertTrue(customHashSet.contains(1));
		Assert.assertTrue(customHashSet.contains(4));
	}

}
