package mojeVjezbe;

import java.util.Scanner;

public class AgregantnoStanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite temperaturu: "); // ako nije naglaseno drugacije u postavci
		int t = sc.nextInt(); 		//cio broj u postavci
		
		// logika zadatka 
		
		if (t <= 0) {
			System.out.println("cvrsto");
			
		} else if (t > 0 && t < 100) {
			System.out.println("tecno");
			
		} else {
			System.out.println("gasovito");
		}

	}

}
