package ba.unsa.etf.rpr.tut1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        System.out.println("Unesite broj");
        Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % sumaCifara(i) == 0)
                System.out.printf("%d ", i);
        }
    }

    private static int sumaCifara(int broj) {
        int suma = 0;
        while (broj > 0) {
            suma += broj % 10;
            broj /= 10;
        }
        return suma;
    }
}
