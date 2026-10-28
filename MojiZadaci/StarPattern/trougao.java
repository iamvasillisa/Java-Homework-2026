package zvezdice;

import java.util.Scanner;

public class trougao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj redova: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
