package Test;

import java.util.Scanner;

public class TestTR7 {


    public static double fahrenheitToCelsius(double temperature) {
    	return (temperature - 32)* 5 / 9;

    }
    
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tastati o temperatura in grade Fahrenheit");
		int temperature = scanner.nextInt();
		double gradeCelsius = fahrenheitToCelsius(temperature);
		System.out.println("fahrenheitToCelsius(" + temperature + ") -> " + gradeCelsius);
		scanner.close();
    }
}