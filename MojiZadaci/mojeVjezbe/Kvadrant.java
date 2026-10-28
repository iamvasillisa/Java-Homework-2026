package mojeVjezbe;

import java.util.Scanner;

public class Kvadrant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite x: ");
        double x = sc.nextDouble();
        System.out.print("Unesite y: ");
        double y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Tacka pripada I kvadrantu.");
        } else if (x < 0 && y > 0) {
            System.out.println("Tacka pripada II kvadrantu.");
        } else if (x < 0 && y < 0) {
            System.out.println("Tacka pripada III kvadrantu.");
        } else if (x > 0 && y < 0) {
            System.out.println("Tacka pripada IV kvadrantu.");
        } else {
            System.out.println("Tacka je na koordinatnoj osi (ne pripada nijednom kvadrantu).");
        }

	}

}
