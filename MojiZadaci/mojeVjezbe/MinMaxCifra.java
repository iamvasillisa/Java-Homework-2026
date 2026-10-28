package mojeVjezbe;

import java.util.Scanner;

public class MinMaxCifra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//zadnja cifra: cifra = n % 10
		// odbaci zadnju cifru: n = n / 10
		// zbir najmanje i najvece cifre 
		
		System.out.print("Unesite broj: ");
		int n = sc.nextInt();
		
		int min = 9;		// pocetna vrijednost: najveca cifra
		int max = 0;		// pocetna vrijednost: najmanja cifra
		
		while ( n > 0) {
			int cifra = n % 10;	 //zadnja cifra

			if (cifra < min) {
				min = cifra;
			}
			if (cifra > max) {
				max = cifra;
			}
			
			n = n / 10; 		// odbaci zadnju cifru
		}
		
		int zbir = min + max;
		System.out.println("Najmanja cifra: " + min);
		System.out.println("Najveca cifra: " + max);
		System.out.println("Zbir: " + zbir);
		
		
		

	}

}
