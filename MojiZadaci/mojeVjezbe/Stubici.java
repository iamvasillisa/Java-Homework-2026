package mojeVjezbe;

import java.util.Scanner;
import java.util.Locale;


public class Stubici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);		// da tacka bude decimalni znak
		
		double d = sc.nextDouble();		// duzina terase u m
		int n = sc.nextInt();			// broj stubica
		double s = sc.nextDouble();		// sirina stubica u cm
		
		double r = (d * 100 - n * s) / (n + 1); 	// razmak u cm
		
		System.out.printf(Locale.US, "%.2f%n", r);
		
	}

}
