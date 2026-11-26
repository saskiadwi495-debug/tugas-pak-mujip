import java.util.Scanner;

public class KalkulatorIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double angka2 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        if (operator == '+') {
            System.out.println("Hasil: " + (angka1 + angka2));
        } else if (operator == '-') {
            System.out.println("Hasil: " + (angka1 - angka2));
        } else if (operator == '*') {
            System.out.println("Hasil: " + (angka1 * angka2));
        } else if (operator == '/') {
            if (angka2 != 0) {
                System.out.println("Hasil: " + (angka1 / angka2));
            } else {
                System.out.println("Tidak bisa membagi dengan nol.");
            }
        } else if (operator == '%') {
            if (angka2 != 0) {
                System.out.println("Hasil: " + (angka1 % angka2));
            } else {
                System.out.println("Tidak bisa menggunakan modulus dengan nol.");
            }
        } else {
            System.out.println("Operator tidak valid.");
        }

        input.close();
    }
}