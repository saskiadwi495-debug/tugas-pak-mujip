// Soal 7 - melengkapi bagian "{ ... }" dan method yang disingkat di soal
public class Card71 {
    String suit, name;
    int points;

    Card71(int n1, int n2) {
        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(n2);
    }

    public String toString() {
        return "The " + name + " of " + suit;
    }

    public String getSuit(int n) {
        switch (n) {
            case 1: return "Clubs";
            case 2: return "Diamonds";
            case 3: return "Hearts";
            default: return "Spades";
        }
    }

    public String getName(int n) {
        switch (n) {
            case 1: return "Ace";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return String.valueOf(n);
        }
    }

    public int getPoints(int n) {
        if (n == 1) return 1;       // Ace = 1 di soal ini (di 6-1 diubah jadi 11)
        if (n >= 10) return 10;     // 10, Jack, Queen, King = 10
        return n;
    }

    public int getPoints() { return points; }
    public String getName() { return name; }
    public String getSuit() { return suit; }
}
