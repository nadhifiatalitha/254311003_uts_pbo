public abstract class LayananTransportasi {
    protected String namaDriver;
    protected double jarak;
    protected double saldoUser;

    public LayananTransportasi(String namaDriver, double jarak, double saldoUser) {
        this.namaDriver = namaDriver;
        if (jarak <= 0) {
            this.jarak = 1.0; 
        } else {
            this.jarak = jarak;
        }
        this.saldoUser = saldoUser;
    }

    public void setJarak(double jarak) {
        if (jarak <= 0) {
            this.jarak = 1.0;
        } else {
            this.jarak = jarak;
        }
    }

    public void setSaldoUser(double saldoUser) {
        this.saldoUser = saldoUser;
    }

    public abstract double hitungTarif();

    protected boolean isSaldoCukup(double totalBayar) {
        return saldoUser >= totalBayar;
    }
}
