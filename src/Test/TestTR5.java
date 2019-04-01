package Test;

import java.util.Scanner;

public class TestTR5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti o suma in RON");
		double sumaRON = scanner.nextDouble();
		System.out.println("Introduceti un curs valutar EUR/RON");
		double cursValutar = scanner.nextDouble();
		double sumaEUR = sumaRON / cursValutar;
		int restEUR = (int) sumaEUR;
		int restRON = (int) ((sumaEUR - restEUR) * cursValutar);
		System.out.println("Suma in EUR: " + restEUR);
		System.out.println("Suma in RON: " + restRON);
		scanner.close();
	}
}
