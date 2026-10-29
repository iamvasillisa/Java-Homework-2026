package nedelja2;

import java.util.Scanner;

public class MjeseciSwitch {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int m = sc.nextInt();

	        String poruka = "Mjesec je ";
	        switch (m) {
	            case 1:
	                poruka += "januar";
	                break;
	            case 2:
	                poruka += "februar";
	                break;
	            case 3:
	                poruka += "mart";
	                break;
	            case 4:
	                poruka += "april";
	                break;
	            case 5:
	                poruka += "maj";
	                break;
	            case 6:
	                poruka += "jun";
	                break;
	            case 7:
	                poruka += "jul";
	                break;
	            case 8:
	                poruka += "avgust";
	                break;
	            case 9:
	                poruka += "septembar";
	                break;
	            case 10:
	                poruka += "oktobar";
	                break;
	            case 11:
	                poruka += "novembar";
	                break;
	            case 12:
	                poruka += "decembar";
	                break;
	            default:
	                poruka = "Nedozvoljen broj";
	        }
	        System.out.println(poruka);
	    }
	
	}


