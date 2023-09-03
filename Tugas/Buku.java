package Jobsheet1.Tugas;

public class Buku {
    private String judul;
    private int halaman;

    public void setJudul(String newValue) {
        judul = newValue;
    }

    public void setHalaman(int newValue) {
        halaman = newValue;
    }

    public void cetakStatus() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println();
    }
}
