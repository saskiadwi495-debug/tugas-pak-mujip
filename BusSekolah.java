public class BusSekolah {
    public static void main(String[] args) {

        int jumlahBus = 10;
        int kapasitasBus = 40;
        int jumlahSiswa = 350;

        int kapasitasTotal = jumlahBus * kapasitasBus;
        int sisaKursi = kapasitasTotal - jumlahSiswa;

        System.out.println("Jumlah bus: " + jumlahBus);
        System.out.println("Kapasitas setiap bus: " + kapasitasBus);
        System.out.println("Jumlah siswa: " + jumlahSiswa);
        System.out.println("Kapasitas total: " + kapasitasTotal);
        System.out.println("Sisa kursi: " + sisaKursi);
    }
}