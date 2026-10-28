package mojeVjezbe;

import java.util.Scanner;



public class mravNaIviciPravougaonik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Donje lijevo tjeme (x1 y1): ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.print("Gornje desno tjeme (x2 y2): ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		System.out.print("Mrav (x y): ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		boolean naIvici = 
				((x == x1 || x == x2) && y >= y1 && y <= y2) ||
				((y == y1 || y == y2) && x >= x1 && x <= x2);
		
		if (naIvici) {
			System.out.println("Mrav se krece po ivici stola.");
			
		} else {
			System.out.println("Mrav nije na ivici stola");
			
		}
		
		

	}

}
