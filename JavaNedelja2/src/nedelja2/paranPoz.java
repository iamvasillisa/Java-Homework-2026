package nedelja2;

import java.util.Scanner;


public class paranPoz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String znak;
		if (n >= 0) {
			znak = "pozitivan";
			
		} else {
			znak = "negativan";
			
			
		}
		
		String parnost;
		if (n % 2 == 0) {
			parnost = "paran";
			
		} else {
			parnost = "neparan";
		}
		
		System.out.println("Broj je " + znak + "/" + parnost);

	}

}
