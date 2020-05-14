package leetcode.cards.hashtables;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public boolean isHappy(int n) {

		Set<Integer> visited = new HashSet<>();
		int sum = n;

		while (true) {

			sum = squaredSum(sum);

			if (sum == 1) {
				return true;
			}

			if (visited.contains(sum)) {
				return false;
			}

			visited.add(sum);
		}
	}

	private int squaredSum(int num) {

		int sum = 0;

		while (num > 0) {

			int digit = num % 10;

			sum += (digit * digit);

			num = num / 10;
		}

		return sum;
	}
}
