package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator1;

public class Program3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator1.circumference(radius);
		
		double v = Calculator1.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator1.PI);
		
		sc.close();

	}

}
