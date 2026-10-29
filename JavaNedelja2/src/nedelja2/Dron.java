package nedelja2;

import java.util.Scanner;
import java.util.Locale;

/*10. Zamislite da se u ravni nalazi dron na poziciji (x, y). Na različitim koordinatama (xi,yi) 
nalaze se paketi koje dron može da pokupi. Za N paketa poznate su njihove koordinate 
(xi,yi). Potrebno je izračunati ukupnu udaljenost koju bi dron morao da pređe od baze (x, 
y) do tih paketa (zbir svih udaljenosti), ali samo za pakete koji se nalaze u prvom 
kvadrantu (sjeveroistočna zona grada). Napomena: dron uvijek kreće od pozicije (x, y)*/

public class Dron {

	//ako je sjeveroistocno od drona
	//if (xi > x && yi > y) {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double x = sc.nextDouble();       // baza
        double y = sc.nextDouble();
        int n = sc.nextInt();             // broj paketa

        double ukupno = 0;                // zbir udaljenosti

        for (int i = 1; i <= n; i++) {
            double xi = sc.nextDouble();
            double yi = sc.nextDouble();

            if (xi > 0 && yi > 0) {                         // prvi kvadrant
                double dx = xi - x, dy = yi - y;
                ukupno = ukupno + Math.sqrt(dx * dx + dy * dy);
            }
        }

        System.out.printf(Locale.US, "Ukupna udaljenost: %.2f%n", ukupno);
    }
	
}
