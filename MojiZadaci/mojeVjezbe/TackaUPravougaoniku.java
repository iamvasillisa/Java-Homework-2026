package mojeVjezbe;

import java.util.Scanner;


public class TackaUPravougaoniku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Gornje lijevo tjeme (x1 y1): ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.print("Donje desno tjeme (x2 y2): ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		System.out.print("Tacka (x y): ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		// logika zadatka
		
		if (x > x1 && x < x2 && y < y1 && y > y2) {
			System.out.println("Tacka je unutar pravougaonika.");
		} else {
			System.out.println("Tacka nije unutar pravougaonika.");
		}

	}

}


// ako kazu da tacka takodje prripada pravougaoniku onda zamijeni sa >= i <=
