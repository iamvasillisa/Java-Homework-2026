package src;

import java.util.Scanner;

public class CijeliMizCm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesi rastojanje u cm: ");
		
		int cm = sc.nextInt();
		
		int m = cm/100;
		
		System.out.println(cm+"cm ima " + m + " cijelih metara.");
		
		sc.close();
		

	}

}
