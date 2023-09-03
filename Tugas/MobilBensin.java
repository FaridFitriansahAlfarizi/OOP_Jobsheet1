package Jobsheet1.Tugas;

public class MobilBensin extends Mobil {
    private int bensin;
    private int kecepatan;

    public void tambahBensin(int newValue) {
        bensin += newValue;
    }

    public void tambahKecepatan(int newValue) {
        kecepatan += newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Bensin: " + bensin + " liter");
        System.out.println("Kecepatan: " + kecepatan + " km/h");
        System.out.println();
    }
}
