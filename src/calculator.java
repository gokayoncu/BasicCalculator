import java.util.Scanner;

import static java.lang.System.out;

public class calculator {
    public static void main(String[] args) {

        int n1, n2;
        int select;
        Scanner input = new Scanner(System.in);
        out.print("Birinci Sayıyı Giriniz: ");
        n1 = input.nextInt();
        out.print("İkinci Sayıyı giriniz :");
        n2 = input.nextInt();

        out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        out.println("Seçiminiz");
        select = input.nextInt();
        switch (select) {
            case 1:
                out.println(n1 + n2);
                break;
            case 2:
                out.println(n1-n2);
                break;
            case 3:
                out.println(n1*n2);
                break;
            case    4:
                System.out.println(n2 !=0 ?(n1/n2):"Bir sayı 0'a bölünemez." );
                break;
            default:
                System.out.println("Hatalı Seçim Yaptınız");


        }


    }

}
