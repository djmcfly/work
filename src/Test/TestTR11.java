package Test;

import java.util.Scanner;

public class TestTR11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tastati un numar intreg: ");
		int n = scanner.nextInt();
		if (isEven(n)) {
			System.out.println("isEven(" + n + ") -> true");
		} else {
			System.out.println("isEven(" + n + ") -> false");
		}
		scanner.close();

	}

	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
}