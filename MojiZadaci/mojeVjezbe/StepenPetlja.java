package mojeVjezbe;

import java.util.Scanner;

public class StepenPetlja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite osnovu X: ");
		double x = sc.nextDouble();
		
		System.out.print("Unesite izlozilac n: ");
		int n = sc.nextInt();
		
		double rezultat = 1; //neutralno za mnozenje
		
		for (int i = 1; i <= n; i++) {
			rezultat = rezultat * x;
			
		}
		
		System.out.println(x + "^" + n + "=" + rezultat);
		

	}

}
