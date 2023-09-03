package Jobsheet1.Tugas;

public class MobilListrik extends Mobil {
    private int listrik;
    private int kecepatan;

    public void tambahListrik(int newValue) {
        listrik += newValue;
    }

    public void tambahKecepatan(int newValue) {
        kecepatan += newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Listrik: " + listrik + " kWh");
        System.out.println("Kecepatan: " + kecepatan + " km/h");
        System.out.println();
    }
}
