/* 
Java kullanılarak hesap makinesi yapımı.

ODEV

Hesap makinesini switch-case kullanarak yapınız.
*/
package Java.ikinciKonu.egzersizler;

import java.util.Scanner;

public class hesapMak {
    public static void main(String[] args){
        int s1, s2, c;

        Scanner scan = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        s1 = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        s2 = scan.nextInt();

        System.out.println("\n1 - Toplama İşlemi:\n2 - Çıkarma İşlemi: \n3 - Çarpma İşlemi: \n4 - Bölme İşlemi: ");
        System.out.println("\nSeçiminiz nedir? ");
        c = scan.nextInt();

        switch(c){
            case 1:
                System.out.print("\nToplam: " + (s1 + s2));
                break;

            case 2:
                System.out.print("\nÇıkan: " + (s1 - s2));
                break;

            case 3:
                System.out.print("\nÇarpım: " + (s1 * s2));
                break;

            case 4:
                if (s2 != 0)
                    System.out.print("\nBölüm: " + (s1 / s2));

                else
                    System.out.println("\nHiçbir sayı SIFIR'a bölünemez, başka sayı girin.");
                
                break;

            default:
                System.out.print("\nGeçersiz işlem, lütfen dört işlemden birini seçin.");

        }
          
    }
    
}
