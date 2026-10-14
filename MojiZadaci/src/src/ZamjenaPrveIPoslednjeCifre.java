package src;

import java.util.Scanner;

public class ZamjenaPrveIPoslednjeCifre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
 //Primjer: 123 → prva cifra 1, srednja 2, posljednja 3 → novi broj 321.
		
		System.out.print("Unesi trocifren broj: ");
		int n = sc.nextInt();
		
		int a = n / 100;
		int b = (n / 10) % 10;
		int c = n % 10;
		
		int noviBroj = c * 100 + b * 10 + a;
		
		System.out.println("Broj poslije zamjene: " + noviBroj);
		
		sc.close();
		
	}

}
