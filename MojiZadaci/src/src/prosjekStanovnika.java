package src;

import java.util.Scanner;

public class prosjekStanovnika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Stanovnika u gradu broj 1: ");
		int s1 = sc.nextInt();
		
		System.out.print("Stanovnika u gradu broj 2: ");
		int s2 = sc.nextInt();
		
		System.out.print("Stanovnika u gradu broj 3: ");
		int s3 = sc.nextInt();
		
		System.out.print("Stanovnika u gradu broj 4: ");
		int s4 = sc.nextInt();
		
		int zbir = s1 + s2 + s3 + s4;
		double prosjek = zbir / 4;
		
		System.out.println("Prosjek stanovnistva: " + prosjek);
		
		sc.close();
		
		//stavili smo cio broj tj int jer ne moze broj stanovnika biti decimalni, tj. 132.2

	}

}
