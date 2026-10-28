package mojeVjezbe;

import java.util.Scanner;


public class DvaKvadrata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite duzinu a: ");
		double a = sc.nextDouble();
		System.out.print("Unesite sirinu b: ");
		double b = sc.nextDouble();
		
		if (b >= 2 * a) {
			System.out.println("Moze se napraviti bar 2 kvadrata.");
			
		} else {
			System.out.println("Ne moze se napraviti 2 kvadrata.");
		}
	}

}
