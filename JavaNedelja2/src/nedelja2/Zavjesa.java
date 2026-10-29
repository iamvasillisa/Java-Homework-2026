package nedelja2;

import java.util.Scanner;


public class Zavjesa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);

	        double zx1 = sc.nextDouble(), zy1 = sc.nextDouble();   // zavjesa: gornje lijevo
	        double zx2 = sc.nextDouble(), zy2 = sc.nextDouble();   // zavjesa: donje desno
	        double px1 = sc.nextDouble(), py1 = sc.nextDouble();   // prozor: gornje lijevo
	        double px2 = sc.nextDouble(), py2 = sc.nextDouble();   // prozor: donje desno

	        boolean prekriva = zx1 <= px1 && zx2 >= px2 && zy1 >= py1 && zy2 <= py2;

	        if (prekriva) {
	            System.out.println("Zavjesa prekriva prozor.");
	        } else {
	            System.out.println("Zavjesa ne prekriva prozor.");
	        }
	}

}
