package Jobsheet1.Tugas;

public class Demo {
    public static void main(String[] args) {
        Buku buku = new Buku();
        Bunga bunga = new Bunga();
        MobilBensin mobil1 = new MobilBensin();
        MobilListrik mobil2 = new MobilListrik();

        buku.setJudul("Sapiens");
        buku.setHalaman(443);
        buku.cetakStatus();

        bunga.setNama("Mawar");
        bunga.setWarna("Biru");
        bunga.cetakStatus();

        mobil1.setMerek("Honda");
        mobil1.setWarna("Silver");
        mobil1.tambahBensin(50);
        mobil1.tambahKecepatan(60);
        mobil1.cetakStatus();

        mobil2.setMerek("Tesla");
        mobil2.setWarna("Merah");
        mobil2.tambahListrik(30);
        mobil2.tambahKecepatan(50);
        mobil2.cetakStatus();
    }
}
