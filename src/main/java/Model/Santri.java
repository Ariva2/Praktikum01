package Model;
public class Santri {
    private int NIS;
    private String nama;
    private double Alquran;

    public Santri() {
    }

    public Santri(int NIS, String nama, double Alquran) {
        this.NIS = NIS;
        this.nama = nama;
        this.Alquran = Alquran;
    }

    public int getNIS() {
        return NIS;
    }

    public void setNIS(int NIS) {
        this.NIS = NIS;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getAlquran() {
        return Alquran;
    }

    public void setAlquran(double Alquran) {
        this.Alquran = Alquran;
    }
    
    public void viewData() {
        System.out.println("=============== View Data Santri ==============");
        System.out.println("NIS \t: "+NIS);
        System.out.println("Nama\t: "+nama);
        System.out.println("Bacaan\t: "+Alquran);
        System.out.println("=============== View Data Santri ==============");
        System.out.println("");
    }
}
