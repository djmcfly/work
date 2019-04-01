package Test;

import java.util.Scanner;

public class TestTR3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti un numar de la tastatura");
		int numar1 = scanner.nextInt();
		int numar2 = (int) Math.pow(numar1, 2);
		int numar3 = (int) Math.pow(numar1, 3);
		System.out.println(numar2);
		System.out.println(numar3);
		scanner.close();
	}
}