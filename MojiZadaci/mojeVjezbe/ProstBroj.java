package mojeVjezbe;

import java.util.Scanner;


public class ProstBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj N: ");
		int n = sc.nextInt();
		
		boolean prost = true;   //pretpostavka da je prost
		
		if (n < 2) {
			prost = false;		// 1, 0 i negat. brojevi	
			
		}
		for (int d = 2; d < n; d++) {		// d = djelilac;		// nasli smo djelilac
			if (n % d == 0) {
				prost = false;
			}
		}
		
		if (prost) {
			System.out.println(n + " je prost broj.");
		} else {
			System.out.println(n + " nije prost broj.");
		}

	}

}
