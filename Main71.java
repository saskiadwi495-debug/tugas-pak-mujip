import java.util.Scanner;

// Soal 7 + 8
public class Main71 {
    static Card71 randomCard() {
        int suitNumber = (int) (Math.random() * 4.0 + 1);
        int faceNumber = (int) (Math.random() * 13.0 + 1);
        return new Card71(suitNumber, faceNumber);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Soal 7: kartu acak pertama dan kedua
        Card71[] hand = new Card71[5];
        int count = 0;
        hand[count++] = randomCard();
        System.out.println(hand[0]);
        hand[count++] = randomCard();
        System.out.println(hand[1]);

        // Soal 8a: total poin dua kartu
        int total = hand[0].getPoints() + hand[1].getPoints();
        System.out.println("Total poin: " + total);

        // Soal 8b + 8c: loop tambah kartu
        while (total <= 21 && count < 5) {
            System.out.print("Mau kartu lagi? (y/n): ");
            if (!in.next().equalsIgnoreCase("y")) break;

            hand[count] = randomCard();
            total += hand[count].getPoints();
            count++;

            System.out.println("Hand kamu:");
            for (int i = 0; i < count; i++)
                System.out.println("  " + hand[i] + " (" + hand[i].getPoints() + " poin)");
            System.out.println("Total poin: " + total);
        }

        if (total > 21) System.out.println("Poin melebihi 21!");
        else if (count == 5) System.out.println("Sudah 5 kartu, selesai.");
    }
}
