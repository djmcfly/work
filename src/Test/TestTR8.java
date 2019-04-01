package Test;

import java.util.Scanner;

public class TestTR8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tastati numarul a: ");
		double a = scanner.nextDouble();
		System.out.println("Tastati numarul b: ");
		double b = scanner.nextDouble();
		double rezultat = divide(a, b);
		System.out.println("Rezultatul impartiri este: " + rezultat);
		scanner.close();

	}

	public static double divide(double a, double b) {
		if (b == 0) {
			return Double.MAX_VALUE;
		}
		return a / b;
	}

}