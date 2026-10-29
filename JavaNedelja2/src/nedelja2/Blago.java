package nedelja2;

import java.util.Scanner;
import java.util.Locale;

public class Blago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		double x1 = sc.nextDouble(), y1 = sc.nextDouble(); //hrast G
		double x2 = sc.nextDouble(), y2 = sc.nextDouble(); //kuca K

		double xb = x2 + 2;  //desno od kuce za 2
		double yb = y2 - 3; // ispod kuce za 3
		
		double dx = xb - x1, dy = yb - y1;
        double vazdusno = Math.sqrt(dx * dx + dy * dy);      // hrast -> blago

        double hrastKuca = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double kucaBlago = Math.sqrt(2 * 2 + 3 * 3);         // uvijek sqrt(13)
        double prekoKuce = hrastKuca + kucaBlago;

        System.out.printf(Locale.US, "Blago: (%.2f, %.2f)%n", xb, yb);
        System.out.printf(Locale.US, "Vazdusno rastojanje: %.2f%n", vazdusno);
        System.out.printf(Locale.US, "Rastojanje preko kuce: %.2f%n", prekoKuce);
    }

	}
	


