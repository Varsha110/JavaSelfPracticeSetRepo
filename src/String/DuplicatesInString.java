package String;

import org.testng.annotations.Test;

public class DuplicatesInString {

	@Test
	public void Duplicates() {
		// TODO Auto-generated method stub

		String sentence = "I love my life";
		char[] chars = sentence.toCharArray();

		System.out.println("Duplicate characters in the string : ");

		for (int i = 0; i < sentence.length(); i++) {
			int count = 1;
			if (chars[i] == '0') {
				continue;
			}
			for (int j = i + 1; j < sentence.length(); j++) {
				if (chars[i] == chars[j]) {
					count++;
					chars[j] = '0';
				}
			}
			if (count > 1) {
				System.out.println(chars[i]);
			}
		}
	}
}
