package leetcode.cards.hashtables;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomHashMapTest {

	private CustomHashMap customHashMap;

	@Before
	public void Setup() {
		customHashMap = new CustomHashMap();
	}

	@Test
	public void Test1() {

		customHashMap.put(1, 1);
		customHashMap.put(2, 2);

		Assert.assertEquals(1, customHashMap.get(1));
		Assert.assertEquals(-1, customHashMap.get(3));
		Assert.assertEquals(2, customHashMap.get(2));

		// Should update key
		customHashMap.put(2, 1);

		Assert.assertEquals(1, customHashMap.get(2));

		customHashMap.remove(2);

		Assert.assertEquals(-1, customHashMap.get(2));
	}

}
