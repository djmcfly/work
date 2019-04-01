package Test;

import java.util.Scanner;

public class TestTR2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti numele: ");
		String text1 = scanner.nextLine();
		String text2 = "Hello, ";
		String text3 = "!";
		String text = text2 + text1 + text3;
		System.out.println(text);
		scanner.close();
	}
}
