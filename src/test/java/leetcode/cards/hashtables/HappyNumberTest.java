package leetcode.cards.hashtables;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HappyNumberTest {

	private HappyNumber happyNumber;

	@Before
	public void Setup() {
		happyNumber = new HappyNumber();
	}

	@Test
	public void Test1() {
		Assert.assertTrue(happyNumber.isHappy(19));
	}

	@Test
	public void Test2() {
		Assert.assertFalse(happyNumber.isHappy(15));
	}

	@Test
	public void Test3() {
		Assert.assertTrue(happyNumber.isHappy(13));
	}

	@Test
	public void Test4() {
		Assert.assertFalse(happyNumber.isHappy(9));
	}

}
