package nedelja2;

import java.util.Scanner;

public class Parking {



	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();            // broj automobila
	        int zarada = 0;                  // ukupna zarada u eurima

	        for (int i = 1; i <= n; i++) {
	            int sati = sc.nextInt();
	            if (sati <= 5) {
	                zarada = zarada + 2 * sati;              // 2 EUR po satu
	            } else {
	                zarada = zarada + 10 + (sati - 5);       // 5 sati po 2 EUR + ostalo po 1 EUR
	            }
	        }

	        System.out.println("Ukupna zarada: " + zarada + " EUR");
	    }
	}


