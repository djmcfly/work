package Test;

import java.util.Scanner;

public class TestTR6 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Primul numar: ");
		int a = scanner.nextInt();
		System.out.println("Al doilea numar: ");
		int b = scanner.nextInt();
		double media = avg(a, b);
		System.out.println(media);
		scanner.close();

	}

	public static double avg(int a, int b) {
		return  (sum(a, b) / 2);

	}

	private static double sum(int a, int b) {
		return a + b;
	}
}
