
public class MataKuliahMain07 {

    public static void main(String[] args) {

        MataKuliah07 mk1 = new MataKuliah07();
        mk1.kodeMK = "SI100";
        mk1.nama = "Algoritma Struktur Data";
        mk1.sks = 3;
        mk1.jumlahjam = 4;
        mk1.tampilnformasi();

        MataKuliah07 mk2 = new MataKuliah07("SI200", "Praktikum Algoritma Struktur Data", 3, 4);

        mk1.tampilnformasi();
        System.out.println();
        mk2.tampilnformasi();
        System.out.println();

        mk1.ubahSKS(2);
        mk1.tambahJam(2);
        mk1.kurangjam(3);

        System.out.println();

        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangjam(10);

    }
}
