package String;

import java.util.Scanner;

import org.testng.annotations.Test;

public class StringReversal {
	
	Scanner sc = new Scanner(System.in);
	
	@Test
	public void stringReversalMethod() {
		// TODO Auto-generated method stub

		System.out.println("Enter the word: ");
		String original = sc.nextLine();
		String rev = "";
		char ch;

		for (int i = 0; i < original.length(); i++) {
			ch = original.charAt(i);
			rev = ch + rev;
		}
		System.out.println("Reversal is : " + rev);
	}
	
	public void stringReversal2() {
		System.out.println("Enter the word: ");
		String originalText1 = sc.nextLine();
		String rev1 = "";
		char ch1;
		
		for(int i=originalText1.length();i>=0;i--) {
			ch1=originalText1.charAt(i);
			rev1=rev1 + ch1;
		}
		System.out.println("Reversible charachter 2 : "+ rev1);
	}

	}
}
