package mojeVjezbe;

import java.util.Scanner;

public class PoslednjiNegativan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Unesite broj dana n: ");
	        int n = sc.nextInt();

	        int posljednji = 0;                    // 0 = jos nije bilo negativne temperature

	        for (int i = 1; i <= n; i++) {         // i = redni broj dana
	            System.out.print("Temperatura za dan " + i + ": ");
	            double t = sc.nextDouble();

	            if (t < 0) {
	                posljednji = i;                // prepisujemo: ovo je do sada zadnji negativan dan
	            }
	        }

	        if (posljednji == 0) {
	            System.out.println("Temperatura nije bila negativna ni u jednom danu.");
	        } else {
	            System.out.println("Posljednji put negativna: dan " + posljednji);
	        }
	}

}
