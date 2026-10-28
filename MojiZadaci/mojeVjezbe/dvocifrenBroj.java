package mojeVjezbe;

import java.util.Scanner;

public class dvocifrenBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// izvlacimo cifre iz dvocifrenog;
		//1. a > b = razlika cifara
		//2. a < b = zbir cifara 
		//3. a = b - proizvod cifara
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite dvocifreni broj: ");
		int broj = sc.nextInt();
		
		//definisemo brojeve 
		
		int a = broj / 10; //prva cifra
		int b = broj % 10; //druga cifra
		
		//logika i if petlja
		
		if (a > b) {
			System.out.println(a - b); //razlika cifara
		} else if (a < b) {
			System.out.println(a + b); //zbir
		} else {
			System.out.println(a * b); //proizvod
			
			
		}
	}

}
