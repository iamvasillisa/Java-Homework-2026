package src;

import java.util.Scanner;

public class pretposlednjaCifra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//četvorocifreni prirodan; formula (n / 10) % 10
		// 1. korak - n / 10 tu micemo zadnju cifru 2537 - 253
		// 2. korak - x % 10 uzeta zadnja cifra 253 - 3
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi broj stambene jedinice: ");
		int n = sc.nextInt();
		
		int sprat = (n / 10) % 10;
		
		System.out.println("Stambene jedinica je na spratu: " + sprat);
		
		sc.close();
		
		
		
		
		
		

	}

}
