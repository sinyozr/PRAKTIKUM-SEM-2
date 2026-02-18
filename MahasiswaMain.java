
public class MahasiswaMain {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Muhammad Ali Farhan", "2241720171", 3.55, "SI 2J");
        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa mhs2 = new Mahasiswa("Cika", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa mhsSinggih = new Mahasiswa("Singgih", "254107060125", 3.66, "SIB 1C");
        mhsSinggih.tampilkanInformasi();
    }
}
