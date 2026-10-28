package mojeVjezbe;

import java.util.Scanner;

public class PrestupnaGodina {
	
	//prestupna godina i stampa odg poruku
	//god je prestupna ako je djeljiva sa 4, i nije djeljiva sa 100
	//ili je djeljiva sa 400
	
	
	//Formula: (g % 4 == 0 && g % 100 != 0) || g % 400 == 0 g % 4 == 0 znači “ostatak pri dijeljenju sa 4 je 0”, dakle djeljivo sa 4.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite godinu: ");
		int g = sc.nextInt();
		
		if ((g % 4 == 0 && g % 100 != 0) || g % 400 == 0) {
			System.out.println(g + " je prestupna godina.");
		}else {
			System.out.println(g + " nije prestupna godina. ");
		}
		

	}

}
