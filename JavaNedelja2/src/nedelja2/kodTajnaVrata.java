package nedelja2;

import java.util.Scanner;


public class kodTajnaVrata {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = n / 100; 	// cifra stotina
		int b = n / 10 % 10;	//cifra desetica
		int c = n % 10;			// cifra jedinica
		
		int kod = a * b * c - (a + b + c);
		System.out.println("Kod: " + kod);

	}

}
