package Model;
public class MahasiswaTransfer extends Mahasiswa{
    private double IPKSebelumnya;
    
    public double getIPKSembelumnya() {
        return IPKSebelumnya;
    }
    
    public void setIPKSebelumnya (double IPKSebelumnya) {
        this.IPKSebelumnya = IPKSebelumnya;
    }
    
    @Override
    public void inputKRS() {
        System.out.println("Mahasiswa Transfer input KRS");
    }
}
