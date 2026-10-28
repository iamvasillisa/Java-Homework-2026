package zvezdice;

import java.util.Scanner;


public class piramidaZvezdica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova: ");
		int n = sc.nextInt();
		
		//petlja 
		//  *
		// ***
		//*****
		
		for (int i = 1; i <=n; i++) { //po redovima
			
			for (int j = i; j <= n; j++) { //razmaci
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) { //zvezdice
				System.out.print("*");
			}
			System.out.println(); //novi red


	}

	}
}


		
