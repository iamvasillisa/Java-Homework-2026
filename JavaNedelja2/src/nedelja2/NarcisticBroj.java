package nedelja2;

import java.util.Scanner;

public class NarcisticBroj {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        // 1. prolaz: prebroji cifre
	        int brojCifara = 0;
	        int a = n;
	        while (a > 0) {
	            brojCifara++;
	            a = a / 10;
	        }

	        // 2. prolaz: zbir cifara na stepen brojCifara
	        int zbir = 0;
	        a = n;                                   // opet kopija originala
	        while (a > 0) {
	            int cifra = a % 10;
	            int stepen = 1;
	            for (int i = 1; i <= brojCifara; i++) {
	                stepen = stepen * cifra;         // cifra^brojCifara
	            }
	            zbir = zbir + stepen;
	            a = a / 10;
	        }

	        if (zbir == n) {
	            System.out.println("Da");
	        } else {
	            System.out.println("Ne");
	        }
	    }
	}

