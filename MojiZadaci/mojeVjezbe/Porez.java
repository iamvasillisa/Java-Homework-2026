package mojeVjezbe;

import java.util.Scanner;

import java.util.Locale;


public class Porez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); 			

		System.out.print("Unesite broj zaposlenih N: ");
        int n = sc.nextInt();

        double ukupno = 0;                     // ukupan porez

        for (int i = 1; i <= n; i++) {         // za svakog zaposlenog
            System.out.print("Plata zaposlenog " + i + ": ");
            double plata = sc.nextDouble();

            double porez;
            if (plata <= 1000) {
                porez = plata * 0.10;          // 10%
            } else {
                porez = plata * 0.20;          // 20%
            }

            ukupno = ukupno + porez;
            
            System.out.printf(Locale.US, "Ukupan porez: %.2f EUR%n", ukupno);
        }

	}

}
