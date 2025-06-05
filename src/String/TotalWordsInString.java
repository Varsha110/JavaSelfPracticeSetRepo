package String;

import java.util.Scanner;

public class TotalWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String sentence = sc.nextLine();

		String sent = "I am a peaceful,happy  and grateful soul";
		int count = 1;

		for (int i = 0; i < sent.length(); i++) {
			if (sent.charAt(i) == ' ') {
				count++;
			}

		}
		System.out.println(count);
	}

}
