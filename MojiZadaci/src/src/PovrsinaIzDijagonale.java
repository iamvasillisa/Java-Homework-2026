package src;

public class PovrsinaIzDijagonale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 50;
		double k = d / Math.sqrt(16*16+9*9);
		double sirina = 16*k;
		double visina = 9*k;
		double povrsina = sirina * visina;
		
		System.out.println("Sirina: " + sirina);
		System.out.println("Visina: " + visina);
		System.out.println("Povrsina: " + povrsina);

	}

}
