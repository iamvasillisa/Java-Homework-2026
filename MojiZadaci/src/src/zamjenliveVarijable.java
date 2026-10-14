package src;

import java.util.Scanner;


public class zamjenliveVarijable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Unesi x: ");
		int x = sc.nextInt();
		
		System.out.print("Unesi y: ");
		int y = sc.nextInt();
		
		System.out.println("Prije zamjene: x = " + x + ", y = " + y);
		
		int pom = x;
		x = y;
		y = pom;
		
		
		System.out.println("Poslije zamjene: x = " + x + ", y = " + y);
		
		sc.close();

		
		
		

	}

}
