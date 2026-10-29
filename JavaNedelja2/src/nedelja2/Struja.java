package nedelja2;

import java.util.Locale;
import java.util.Scanner;

public class Struja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = sc.nextInt();           // broj domacinstava
        double ukupno = 0;              // zbir svih potrosnji
        double preko500 = 0;            // zbir potrosnji vecih od 500

        for (int i = 1; i <= n; i++) {
            double kwh = sc.nextDouble();
            ukupno = ukupno + kwh;
            if (kwh > 500) {
                preko500 = preko500 + kwh;
            }
        }

        System.out.printf(Locale.US, "Ukupna potrosnja: %.2f kWh%n", ukupno);
        System.out.printf(Locale.US, "Zbir za domacinstva preko 500 kWh: %.2f kWh%n", preko500);
    }
}


