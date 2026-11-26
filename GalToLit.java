import java.util.Scanner;

public class GalToLit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah galon: ");
        double gallons = in.nextDouble();

        double liters = gallons * 3.785;

        System.out.println(gallons + " gallons equals " + liters + " liters");

        in.close();
    }
}