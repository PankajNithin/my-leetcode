package leetcode.problemset.bloomberg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LRUCacheTest {

	LRUCache lruCache;

	@Before
	public void Setup() {
		lruCache = new LRUCache(2);
	}

	@Test
	public void Test1() {

		lruCache.put(1, 1);
		lruCache.put(2, 2);

		Assert.assertEquals(1, lruCache.get(1));

		lruCache.put(3, 3);

		Assert.assertEquals(-1, lruCache.get(2));

		lruCache.put(4, 4);

		Assert.assertEquals(-1, lruCache.get(1));

		Assert.assertEquals(3, lruCache.get(3));
		Assert.assertEquals(4, lruCache.get(4));
	}

}
