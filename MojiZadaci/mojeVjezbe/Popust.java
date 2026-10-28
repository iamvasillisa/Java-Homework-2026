package mojeVjezbe;

import java.util.Scanner;
import java.util.Locale;

public class Popust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); //tacka kao dec znak
		
		double skolarina = sc.nextDouble();
		double ocjena = sc.nextDouble();
		int nagrada = sc.nextInt();
		
		int popust = 0;			//popust u procentima
		
		if (ocjena >= 4.5) {
			popust = 40;		//odlican
		} else if (ocjena >= 3.5) {
			popust = 20;		//vrlodobar
		} else if (ocjena >= 2.5) {
			popust = 10;		//dobar

	}
		if (nagrada == 1 && popust < 30) { 		//veci popust pobjedjuje
			popust = 30;
		}
		
		double zaPlatiti = skolarina * (1 - popust / 100.00);
		
		System.out.println(Math.round(zaPlatiti));
		
	}
}
