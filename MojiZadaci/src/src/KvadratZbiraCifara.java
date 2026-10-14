package src;

import java.util.Scanner;

public class KvadratZbiraCifara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi cetvorocifreni broj: ");
		int n = sc.nextInt();
		
		int c1 = n / 1000;
		int c2 = (n / 100) % 10;
		int c3 = (n / 10) % 10;
		int c4 = n % 10;
		
		int zbir = c1 + c2 + c3 + c4;
		int kvadrat = zbir * zbir;
		
		System.out.println("Zbir cifara: " + zbir);
		System.out.println("Kvadrat zbira: " + kvadrat);
		
		sc.close();
		
		
		
		
		

	}

}
