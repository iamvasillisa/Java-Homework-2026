package mojeVjezbe;

import java.util.Scanner;
import java.util.Locale;


public class SredinaNbrojeva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj N: ");
		int n = sc.nextInt();
		
		int zbir = 0;				// zbir cifara
		int brojCifara = 0;			 //koliko cif ima broj
		
		while (n > 0) {
			int cifra = n % 10;		 //zadnja cifra
			zbir = zbir + cifra;	// dodaj u zbir
			brojCifara++; 			// jos jedna cifra
			n = n / 10; 			//odbaci zadnju cifru
		}
		
		double sredina = (double) zbir / brojCifara;
		
		System.out.printf(Locale.US, "Aritmeticka sredina: %.2f%n", sredina);

	}

}
