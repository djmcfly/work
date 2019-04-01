package Test;

import java.util.Scanner;

public class TestTR4 {
  public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti o suma in EUR");
		double numar1 = scanner.nextDouble();
		System.out.println("Introduceti un schimb valutar");
		double numar2 = scanner.nextDouble();
		double suma = (numar1 * numar2);
		System.out.println("Suma in RON: " + suma);
		scanner.close();
  }
}

