package mojeVjezbe;

import java.util.Scanner;


public class obimStola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//racunamo obim stola sa vecom povrsinom
		
		// formule : P kruga -> P = r ^ 2 * pi
		// 			Obim kruga -> O = 2 * r * pi
		
		// ako je r veci samim tim je i P; r moze biti decimalan zato je bolje staviti double
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite poluprecnik prvog stola: ");
		double r1 = sc.nextDouble();
		
		System.out.print("Unesite poluprecnik drugog stola: ");
		double r2 = sc.nextDouble();
		
		double p1 = r1 * r1 * Math.PI; //povrsina
		double p2 = r2 * r2 * Math.PI;
		
		//petlja i logika
		
		if (r1 > r2) {
			System.out.println(2 * r1 * Math.PI); //obim
		} else {
			System.out.println(2 * r2 * Math.PI);
			
		}
		

	}

}
