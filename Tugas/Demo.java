package Jobsheet1.Tugas;

public class Demo {
    public static void main(String[] args) {
        Buku buku = new Buku();
        Bunga bunga = new Bunga();
        Mobil mobil1 = new Mobil();
        MobilBensin mobil2 = new MobilBensin();
        MobilListrik mobil3 = new MobilListrik();

        buku.setJudul("Sapiens");
        buku.setHalaman(443);
        buku.cetakStatus();

        bunga.setNama("Mawar");
        bunga.setWarna("Biru");
        bunga.cetakStatus();

        mobil1.setMerek("Supra");
        mobil1.setWarna("Hitam");
        mobil1.cetakStatus();
        System.out.println();

        mobil2.setMerek("Honda");
        mobil2.setWarna("Silver");
        mobil2.tambahBensin(50);
        mobil2.tambahKecepatan(60);
        mobil2.cetakStatus();

        mobil3.setMerek("Tesla");
        mobil3.setWarna("Merah");
        mobil3.tambahListrik(30);
        mobil3.tambahKecepatan(50);
        mobil3.cetakStatus();
    }
}
