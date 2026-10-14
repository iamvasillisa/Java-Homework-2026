package src;

public class KvadratUPravougaoniku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 543;
		int b = 130;
		int s = 65;
		
		//nismo stavili Scanner jer vec imamo date podatke u zadatku, da se trazio unos stavili bismo Scanner
		//formula je a/s * b/s
		
		int poDuzini = a/s;
		int poSirini = b/s;
		int brojKvadrata = poDuzini * poSirini;
		
		System.out.println("Po duzini staje: " + poDuzini);
		System.out.println("Po sirini staje: " + poSirini);
		System.out.println("Ukupan kvadrata: " + brojKvadrata);
	}

}
