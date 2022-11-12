import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*
        Dairenin Alanını ve Çevresini Hesaplayan Program
            Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

                Alan Formülü : π * r * r;

                Çevre Formülü : 2 * π * r;

        Ödev
            Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

                𝜋 sayısını = 3.14 alınız.

                Formül : (𝜋 * (r*r) * 𝛼) / 360
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin Alanını ve Çevresini Hesapla");
        System.out.print("Dairenin Yarı Çapını Giriniz : ");
        double r = input.nextDouble();

        double Alan = Math.PI * r * r;
        double Cevre = 2 * Math.PI * r;

        System.out.println("Dairenin Alanı : " + Alan + "\nDairenin Çevresi : " + Cevre);

        // Ödev Çözüm

        System.out.println("Dairenin Alanını Yarı Çap Ve Merkez Açı İle Bulma");
        double pi = 3.14;

        System.out.print("Dairenin Yarı Çapını Giriniz : ");
        double R = input.nextDouble();

        System.out.print("Merkez Açı Ölçüsü : ");
        double a = input.nextDouble();

        double sonuc = (pi * (R * R) * a) / 360;

        System.out.println("Girilen Dairenin Alanı : " + sonuc);
    }
}