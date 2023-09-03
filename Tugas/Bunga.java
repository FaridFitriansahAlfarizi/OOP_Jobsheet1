package Jobsheet1.Tugas;

public class Bunga {
    private String nama;
    private String warna;

    public void setNama(String newValue) {
        nama = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void cetakStatus() {
        System.out.println("Nama Bunga: " + nama);
        System.out.println("Warna Bunga: " + warna);
        System.out.println();
    }
}
