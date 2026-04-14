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


class MadiunMotor extends LayananTransportasi {
    public MadiunMotor(String namaDriver, double jarak, double saldoUser) {
        super(namaDriver, jarak, saldoUser);
    }

    @Override
    public double hitungTarif() {
        return jarak * 2500.0;
    }

    public void prosesTransaksi() {
        String namaLengkap = "Nadhifiatalitha";
        String nim = "254311003";

        System.out.println("=== Transaksi oleh " + namaLengkap + " - " + nim + " ===");
        double totalBayar = hitungTarif();
        if (isSaldoCukup(totalBayar)) {
            saldoUser -= totalBayar;
            System.out.println("Driver: " + namaDriver);
            System.out.println("Jarak: " + jarak + " km");
            System.out.println("Total Bayar: Rp " + totalBayar);
            System.out.println("Sisa Saldo: Rp " + saldoUser);
        } else {
            System.out.println("Gagal: Saldo tidak mencukupi untuk perjalanan ini!");
        }
    }
}
class MadiunMobil extends LayananTransportasi {
    private int nimAkhir = 3; 

    public MadiunMobil(String namaDriver, double jarak, double saldoUser, int nimAkhir) {
        super(namaDriver, jarak, saldoUser);
        this.nimAkhir = nimAkhir;
    }

    @Override
    public double hitungTarif() {
        double biayaAdmin = 3000 + (nimAkhir * 100); 
        return (jarak * 5000.0) + biayaAdmin;
    }

    public void prosesTransaksi() {
        String namaLengkap = "Nadhifiatalitha";
        String nim = "254311003";

        System.out.println("=== Transaksi oleh " + namaLengkap + " - " + nim + " ===");
        double totalBayar = hitungTarif();
        if (isSaldoCukup(totalBayar)) {
            saldoUser -= totalBayar;
            System.out.println("Driver: " + namaDriver);
            System.out.println("Jarak: " + jarak + " km");
            System.out.println("Total Bayar: Rp " + totalBayar);
            System.out.println("Sisa Saldo: Rp " + saldoUser);
        } else {
            System.out.println("Gagal: Saldo tidak mencukupi untuk perjalanan ini!");
        }
    }
}