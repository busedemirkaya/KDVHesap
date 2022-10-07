import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran1 = 0.18, kdvOran2 = 0.08, kdvliTutar1, kdvliTutar2;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürün fiyatı: ");
        tutar = input.nextDouble();
        double sonuc = (tutar <= 1000) ? ((tutar * kdvOran1)+tutar) : ((tutar * kdvOran2) +tutar);

        System.out.println(sonuc);


    }
}