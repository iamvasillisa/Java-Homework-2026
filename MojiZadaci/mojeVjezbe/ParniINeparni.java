package mojeVjezbe;

import java.util.Scanner;

public class ParniINeparni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// paran - zbir parnih cifara   
		// neparni - proizvod neparnih cifara
		
		boolean paran = ( n % 2 == 0); //pamtimo PRIJE petlje, jer petlja mijenja n 
		
		int zbir = 0;
		int proizvod = 1; 		
		
		while (n > 0) {
			int cifra = n % 10;				//zadnja cifra
			
			if (paran && cifra % 2 == 0) {
				zbir = zbir + cifra;			//parni broj: sabiramo parne cifre
			}
			if (!paran && cifra % 2 != 0) {
				proizvod = proizvod * cifra;	//neparni broj: mnozimo neparne cifre
			}
			n = n / 10;							// odbaci zadnju cifru
		}
		
		if (paran) {
			System.out.println("Zbir parnih cifara: " + zbir);
			
		} else {
			System.out.println("Proizvod neparnih cifara: " + proizvod);
			
		}
		
		

	}

}
