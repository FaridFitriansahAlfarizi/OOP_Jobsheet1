package Jobsheet1.Tugas;

public class Mobil {
    private String merek;
    private String warna;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void cetakStatus() {
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Warna Mobil: " + warna);
    }
}
