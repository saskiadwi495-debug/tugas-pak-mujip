import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static String bersihkan(String teks) {
        String hasil = "";

        for (int i = 0; i < teks.length(); i++) {
            char karakter = Character.toLowerCase(teks.charAt(i));

            if (Character.isLetter(karakter)) {
                hasil += karakter;
            }
        }

        return hasil;
    }

    public static boolean cekAnagram(String kata1, String kata2) {
        String teks1 = bersihkan(kata1);
        String teks2 = bersihkan(kata2);

        if (teks1.length() != teks2.length()) {
            return false;
        }

        char[] huruf1 = teks1.toCharArray();
        char[] huruf2 = teks2.toCharArray();

        Arrays.sort(huruf1);
        Arrays.sort(huruf2);

        return Arrays.equals(huruf1, huruf2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata atau kalimat pertama: ");
        String kata1 = input.nextLine();

        System.out.print("Masukkan kata atau kalimat kedua: ");
        String kata2 = input.nextLine();

        if (cekAnagram(kata1, kata2)) {
            System.out.println("Kedua teks adalah anagram.");
        } else {
            System.out.println("Kedua teks bukan anagram.");
        }

        input.close();
    }
}