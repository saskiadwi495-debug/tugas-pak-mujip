import java.util.Scanner;

public class KalkulatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double angka2 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        double hasil;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Tidak bisa membagi dengan nol.");
                }
                break;
            case '%':
                if (angka2 != 0) {
                    hasil = angka1 % angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Tidak bisa menggunakan modulus dengan nol.");
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
        }

        input.close();
    }
}