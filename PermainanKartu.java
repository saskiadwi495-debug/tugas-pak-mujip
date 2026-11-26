import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// CLASS CARD
class Card {
    String angka;
    String jenis;

    Card(String angka, String jenis) {
        this.angka = angka;
        this.jenis = jenis;
    }

    int getNilai() {
        if (angka.equals("A")) {
            return 11;
        } else if (angka.equals("J") ||
                   angka.equals("Q") ||
                   angka.equals("K")) {
            return 10;
        } else {
            return Integer.parseInt(angka);
        }
    }

    public String toString() {
        return angka + " " + jenis;
    }
}

// CLASS DECK
class Deck {
    ArrayList<Card> kartu = new ArrayList<>();

    Deck() {
        String[] angka = {
            "A", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "J", "Q", "K"
        };

        String[] jenis = {
            "Hati", "Wajik", "Keriting", "Sekop"
        };

        for (String j : jenis) {
            for (String a : angka) {
                kartu.add(new Card(a, j));
            }
        }
    }

    void shuffle() {
        Collections.shuffle(kartu);
    }

    Card ambilKartu() {
        if (kartu.isEmpty()) {
            return null;
        }

        return kartu.remove(0);
    }
}

// CLASS HAND
class Hand {
    ArrayList<Card> kartu = new ArrayList<>();

    void tambahKartu(Card card) {
        if (card != null && kartu.size() < 5) {
            kartu.add(card);
        }
    }

    int hitungNilai() {
        int total = 0;
        int jumlahAce = 0;

        for (Card card : kartu) {
            total += card.getNilai();

            if (card.angka.equals("A")) {
                jumlahAce++;
            }
        }

        // Ace berubah dari 11 menjadi 1
        // jika total nilai lebih dari 21
        while (total > 21 && jumlahAce > 0) {
            total -= 10;
            jumlahAce--;
        }

        return total;
    }

    void tampilkanKartu() {
        for (Card card : kartu) {
            System.out.println("- " + card);
        }

        System.out.println("Total nilai: " + hitungNilai());
    }

    int jumlahKartu() {
        return kartu.size();
    }
}

// CLASS MAIN
public class PermainanKartu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Deck deck = new Deck();
        Hand pemain = new Hand();
        Hand dealer = new Hand();

        deck.shuffle();

        System.out.println("=== PERMAINAN KARTU ===");

        // Pemain mengambil kartu
        boolean lanjut = true;

        while (lanjut &&
               pemain.jumlahKartu() < 5 &&
               pemain.hitungNilai() <= 21) {

            pemain.tambahKartu(deck.ambilKartu());

            System.out.println("\nKartu pemain:");
            pemain.tampilkanKartu();

            if (pemain.hitungNilai() > 21) {
                System.out.println("Nilai pemain melewati 21!");
                break;
            }

            if (pemain.jumlahKartu() == 5) {
                System.out.println("Pemain sudah memiliki 5 kartu.");
                break;
            }

            System.out.print("\nAmbil kartu lagi? (y/n): ");
            String jawaban = input.nextLine();

            if (jawaban.equalsIgnoreCase("n")) {
                lanjut = false;
            } else if (!jawaban.equalsIgnoreCase("y")) {
                System.out.println("Pilihan tidak valid.");
                lanjut = false;
            }
        }

        // Dealer mengambil kartu
        System.out.println("\n=== GILIRAN DEALER ===");

        while (dealer.hitungNilai() < 16 &&
               dealer.jumlahKartu() < 5) {

            dealer.tambahKartu(deck.ambilKartu());
        }

        System.out.println("\nKartu dealer:");
        dealer.tampilkanKartu();

        // Menampilkan hasil akhir
        System.out.println("\n=== HASIL PERMAINAN ===");

        System.out.println("Nilai pemain: " + pemain.hitungNilai());
        System.out.println("Nilai dealer: " + dealer.hitungNilai());

        if (pemain.hitungNilai() > 21) {
            System.out.println("Dealer menang!");
        } else if (dealer.hitungNilai() > 21) {
            System.out.println("Pemain menang!");
        } else if (pemain.hitungNilai() > dealer.hitungNilai()) {
            System.out.println("Pemain menang!");
        } else if (pemain.hitungNilai() < dealer.hitungNilai()) {
            System.out.println("Dealer menang!");
        } else {
            System.out.println("Hasil seri!");
        }

        input.close();
    }
}