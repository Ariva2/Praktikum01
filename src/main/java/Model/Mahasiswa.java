package Model;
public class Mahasiswa {
    private int id;
    private String NPM;
    private String nama;
    private double IPK;

    public Mahasiswa() {
    }

    public Mahasiswa(int id, String NPM, String nama, double IPK) {
        this.id = id;
        this.NPM = NPM;
        this.nama = nama;
        this.IPK = IPK;
    }
    
    public void mendaftarUlang() {
        System.out.println("Mahasiswa mendaftar ulang");
    }
    
    public void inputKRS() {
        System.out.println("Mahasiswa input KRS");
    }
    
    public void inputKRS(int jumlahSKS) {
        System.out.println("Mahasiswa input KRS sebanyak: "+jumlahSKS+ "SKS");
    }
    
    public void inputKRS(float IPSemester) {
        System.out.println("Mahasiswa nilai rata-rata semester sebanyak: "+IPSemester+ "IPSemester");
    }
    
    public void inputKRS(String namaMahasiswa) {
        System.out.println("Mahasiswa ini Bernama: "+namaMahasiswa);
    }
    
    public void inputKRS(char namaDosenPembimbing) {
        System.out.println("Mahasiswa memiliki dosen pembimbing bernama: "+namaDosenPembimbing);
    }
    
    public void inputKRS(int jumlahSKS, float IPSemester) {
        System.out.println("Mahasiswa Memiliki SKS: "+jumlahSKS+ "SKS");
        System.out.println("Mahasiswa nilai rata-rata semester sebanyak: "+IPSemester+ "IPSemester");
    }
    
    public void inputKRS(int jumlahMK, double IPK) {
        System.out.println("Mahasiswa memilih Mata Kuliah Sebanyak: "+jumlahMK+ "MK");
        System.out.println("Mahasiswa memiliki IPK Sebanyak: "+IPK+ "IPK");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNPM() {
        return NPM;
    }

    public void setNPM(String NPM) {
        this.NPM = NPM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
    
    public void viewData() {
            System.out.println("=============== View Data ===============");
            System.out.println("ID  \t: "+id);
            System.out.println("NPM \t: "+NPM);
            System.out.println("Nama\t: "+nama);
            System.out.println("IPK \t: "+IPK);
            System.out.println("=============== View Data ===============");
            System.out.println("");
    }
    

}
