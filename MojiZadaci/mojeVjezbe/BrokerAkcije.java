package mojeVjezbe;

import java.util.Scanner;


public class BrokerAkcije {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite iznos N (eura): ");
        double n = sc.nextDouble();

        System.out.print("Unesite jucerasnju cijenu akcije X (eura): ");
        double x = sc.nextDouble();

        double novaCijena = x * 1.15;              // skok od 15%

        int brojAkcija = (int) (n / novaCijena);   // cijeli dio

        if (brojAkcija > 0) {
            System.out.println("Broker moze kupiti " + brojAkcija + " akcija.");
        } else {
            System.out.println("Broker ne moze kupiti nijednu akciju.");
        }

	}

}
