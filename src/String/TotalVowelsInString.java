package String;

import java.util.Scanner;

public class TotalVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String sentence = sc.nextLine();
		int vowelsCount = 0;
		int letterCOunt = 1;

		for (int i = 0; i < sentence.length(); i++) {
			
			if(sentence.charAt(i)==' ') {
				letterCOunt++;
			}
			
			if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i'
					|| sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u' || sentence.charAt(i) == 'A'
					|| sentence.charAt(i) == 'E' || sentence.charAt(i) == 'I' || sentence.charAt(i) == 'O'
					|| sentence.charAt(i) == 'U') {
				vowelsCount++;
			}
			
		}
		System.out.println("Total vowels are :" + vowelsCount);
		System.out.println("Total letters are :" + letterCOunt);
	}

}
