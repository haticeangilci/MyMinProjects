import java.util.Scanner;

public class P05_BedenKitleEndeksi {
    public static void main(String[] args) {
        //Beden kitle indeksini hesaplayan ve hangi kilo alanında olduğunu hesaplayan bir formul yaziniz
        //indeks = (kilo / (boy*boy)
        //18.5-25 zayif, 25-30 normal, 30=35 obez, 35 ustu asiri obez
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu giriniz  orn 1,79 ");
        double boy = scan.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz orn 80,3");
        double kilo = scan.nextDouble();
        double indeks = kilo / (boy * boy);
        if (indeks < 0) {
            System.out.println("Hata " +
                    "Lutfen boy ve kilonuzu dogru girdiginizden emin olun");
        } else if (indeks < 25) {
            System.out.println("Indeksiniz :" + indeks + " Zayifsiniz");
        } else if (indeks < 30) {
            System.out.println("Indeksiniz :" + indeks + " Normalsiniz");
        } else if (indeks < 35) {
            System.out.println("Indeksiniz :" + indeks + " Obezsiniz");
        } else {
            System.out.println("Indeksiniz :" + indeks + " Asiri Obezsiniz");
        }
    }
}
