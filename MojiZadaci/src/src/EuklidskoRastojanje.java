package src;

import java.util.Scanner;
import java.util.Locale;

public class EuklidskoRastojanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("Unesi x1: ");
		double x1 = sc.nextDouble();
		System.out.print("Unesi y1: ");
		double y1 = sc.nextDouble();
		
		System.out.print("Unesi x2: ");
		double x2 = sc.nextDouble();
		System.out.print("Unesi y2: ");
		double y2 = sc.nextDouble();
		
//racunamo sredinu
		double x3 = (x1+x2)/2;
		double y3 = (y1+y2)/2;
		
//rastojanje svakog studenta
		
		double dx = x3 - x1;
		double dy = y3 - y1;
		
		double d = Math.sqrt(dx*dx + dy*dy);
		
			System.out.println("Tacka susreta: (" + x3 + ", " + y3 + ")");
	        System.out.println("Rastojanje svakog studenta do nje: " + d);
	        
	        sc.close();
	        
	}

}
