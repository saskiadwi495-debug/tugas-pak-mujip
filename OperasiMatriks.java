import java.util.Scanner;

public class OperasiMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] hasil = new int[2][2];
        int pilihan;

        // Input matriks A
        System.out.println("=== INPUT MATRIKS A ===");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
            }
        }

        // Input matriks B
        System.out.println("\n=== INPUT MATRIKS B ===");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = input.nextInt();
            }
        }

        // Menu operasi matriks
        do {
            System.out.println("\n=== MENU OPERASI MATRIKS ===");
            System.out.println("1. Penjumlahan A + B");
            System.out.println("2. Pengurangan A - B");
            System.out.println("3. Perkalian A x B");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nHasil Penjumlahan A + B:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            hasil[i][j] = A[i][j] + B[i][j];
                            System.out.print(hasil[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("\nHasil Pengurangan A - B:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            hasil[i][j] = A[i][j] - B[i][j];
                            System.out.print(hasil[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("\nHasil Perkalian A x B:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            hasil[i][j] = 0;
                            for (int k = 0; k < 2; k++) {
                                hasil[i][j] += A[i][k] * B[k][j];
                            }
                            System.out.print(hasil[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi!");
            }

        } while (pilihan != 4);

        input.close();
    }
}