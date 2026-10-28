package mojeVjezbe;

import java.util.Scanner;
import java.util.Locale;

public class ZbirSredineCifara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
        int n = sc.nextInt();

        int zbir = 0;                 // zbir cifara
        int brojCifara = 0;           // koliko cifara ima broj

        while (n > 0) {
            int cifra = n % 10;       // zadnja cifra
            zbir = zbir + cifra;
            brojCifara++;
            n = n / 10;               // odbaci zadnju cifru
        }

        double sredina = (double) zbir / brojCifara;

        System.out.println("Zbir cifara: " + zbir);
        System.out.printf(Locale.US, "Aritmeticka sredina: %.2f%n", sredina);
	}

}
