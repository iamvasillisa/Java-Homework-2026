package mojeVjezbe;

import java.util.Scanner;


public class NajveciZbirCijena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		//formule
		// s1 = a + b
		//s2 = a + c
		// s3 = b + c 
		
		System.out.print("Cijena prvog proizvoda: ");
		double a = sc.nextDouble();
		
		System.out.print("Cijena drugog proizvoda: ");
		double b = sc.nextDouble();
		
		System.out.print("Cijena treceg proizvoda: ");
		double c = sc.nextDouble();
		
		double s1 = a + b;  //par 1 i 2
		double s2 = a + c;  // par 1 i 3
		double s3 = b + c; //par 2 i 3
		
		if (s1 >= s2 && s1 >= s3) {
			System.out.println("Par: prvi i drugi, zbir = " + s1);
		
		}else if (s2 >= s1 && s2 >= s3) {
			System.out.println("Par: prvi i treci, zbir = " + s2);
			
		} else {
			System.out.println("Par: drugi i treci, zbir = " + s3);
		}

	}

}
