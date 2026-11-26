import java.util.Scanner;

public class KebutuhanCat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi ruangan (kaki): ");
        double tinggi = input.nextDouble();

        System.out.print("Masukkan panjang ruangan (kaki): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar ruangan (kaki): ");
        double lebar = input.nextDouble();

        if (tinggi <= 0 || panjang <= 0 || lebar <= 0) {
            System.out.println("Ukuran ruangan harus lebih dari nol.");
            input.close();
            return;
        }

        double luasDinding = 2 * tinggi * (panjang + lebar);
        double luasPlafon = panjang * lebar;
        double totalLuas = luasDinding + luasPlafon;

        int ember5 = 0;
        int ember1 = 0;
        double biayaMinimum = Double.MAX_VALUE;

        int maksimalEmber5 = (int) Math.ceil(totalLuas / 1500.0);

        for (int i = 0; i <= maksimalEmber5; i++) {
            double sisaLuas = totalLuas - (i * 1500.0);

            int jumlahEmber1 = Math.max(
                0, (int) Math.ceil(sisaLuas / 300.0)
            );

            double biaya = (i * 15.0) + (jumlahEmber1 * 4.0);

            if (biaya < biayaMinimum) {
                biayaMinimum = biaya;
                ember5 = i;
                ember1 = jumlahEmber1;
            }
        }

        System.out.printf("Luas dinding: %.2f kaki persegi%n", luasDinding);
        System.out.printf("Luas langit-langit: %.2f kaki persegi%n", luasPlafon);
        System.out.printf("Total luas yang dicat: %.2f kaki persegi%n", totalLuas);
        System.out.println("Ember 5 liter: " + ember5);
        System.out.println("Ember 1 liter: " + ember1);
        System.out.printf("Total biaya: $%.2f%n", biayaMinimum);

        input.close();
    }
}