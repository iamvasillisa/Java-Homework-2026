package mojeVjezbe;

import java.util.Scanner;

public class Kazne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Unesite broj vozaca N: ");
	        int n = sc.nextInt();

	        int ukupno = 0;                        // ukupna suma kazni u eurima

	        for (int i = 1; i <= n; i++) {         // za svakog vozaca
	            System.out.print("Brzina vozaca " + i + ": ");
	            int brzina = sc.nextInt();

	            if (brzina > 50) {                 // samo ako je prekoracio limit
	                ukupno = ukupno + (brzina - 50) * 10;
	            }
	        }

	        System.out.println("Ukupna suma kazni: " + ukupno + " EUR");
	    }

	}


