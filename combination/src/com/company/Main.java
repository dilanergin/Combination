package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu
	olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
    Java ile kombinasyon hesaplayan program yazınız.
    Kombinasyon formülü
    C(n,r) = n! / (r! * (n-r)!) */
        int fak = 1, fak2 = 1, fak3 = 1, C;
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int n = scan.nextInt();
        System.out.print("r: ");
        int r = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            fak *= i;
        }
        for (int j = 1; j <= r; j++) {
            fak2 *= j;
        }
        for (int k = 1; k <= (n - r); k++) {
            fak3 *= k;
        }
        System.out.print("n'in r'li kombinasyonu: ");
        C = fak / (fak2 * fak3);
        System.out.println(C);


    }
}
