package leetcode.cards.apple;

import java.util.LinkedHashSet;
import java.util.Set;

public class NonRepeatingLongestSubstring {

	public int solution(String inputString) {

		if (inputString == null || inputString.isEmpty()) {
			return 0;
		}

		if (inputString.length() < 2) {
			return 1;
		}

		int pointer1 = 0;
		int pointer2 = 0;
		int maxSize = 0;

		Set<Character> charSet = new LinkedHashSet<Character>();

		while (pointer2 < inputString.length()) {

			if (!charSet.contains(inputString.charAt(pointer2))) {

				charSet.add(inputString.charAt(pointer2));
				maxSize = Math.max(charSet.size(), maxSize);

				pointer2++;
				continue;
			}

			charSet.remove(inputString.charAt(pointer1));
			pointer1++;
		}

		return maxSize;
	}

}
