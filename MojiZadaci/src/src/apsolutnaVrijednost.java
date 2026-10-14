package src;


import java.util.Scanner;

public class apsolutnaVrijednost {

    static double srednjaVrijednost(double a, double b) {
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi a: ");
        double a = sc.nextDouble();

        System.out.print("Unesi b: ");
        double b = sc.nextDouble();

        double rezultat = srednjaVrijednost(a, b);
        System.out.println("Srednja vrijednost je: " + rezultat);

        sc.close();
    }
}


