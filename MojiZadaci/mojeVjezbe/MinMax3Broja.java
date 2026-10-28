package mojeVjezbe;

import java.util.Scanner;

public class MinMax3Broja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//koristimo ovde if petlju
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Unesite prvi broj: ");
		int a = sc.nextInt();
		
		System.out.print("Unesite drugi broj: ");
		int b = sc.nextInt();
		
		System.out.print("Unesite treci broj: ");
		int c = sc.nextInt();
		
		//pretpostavka da je prvi max i min
		
		int min = a;
		int max = a;
		
		if (b < min) {
			min = b;
		}
		if (b > max) {
			max = b;
		}
		if (c < min) {
			c = min;
		}
		if (c > max) {
			max = c;
	}
	
		System.out.println("Minimum: " + min);
		System.out.println("Maksimum: " + max);
		
	}

}
