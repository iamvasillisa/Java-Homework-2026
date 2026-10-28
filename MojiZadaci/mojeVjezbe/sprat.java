package mojeVjezbe;

import java.util.Scanner;

public class sprat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Unesi petocifreni broj stambene jedinice: ");
		
		int n = sc.nextInt();
		
		//logika zadatka
		
		int poslednja = n % 10;
		int pretposlednja = n / 10 % 10;
		int sprat = pretposlednja + poslednja;
		
		System.out.println("Sprat: " + sprat);
		
		
		
	}

}
