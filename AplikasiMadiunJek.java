public class AplikasiMadiunJek{
    public static void main(String[] args) {
        LayananTransportasi[] layanan = new LayananTransportasi[2];

        layanan[0] = new MadiunMotor("Budi", 10, 50000);
        layanan[1] = new MadiunMobil("Andi", 5, 100000, 3); 

        for (LayananTransportasi l : layanan) {
            double tarif = l.hitungTarif();
            System.out.println("Tarif dihitung: Rp " + tarif);

            if (l instanceof MadiunMotor) {
                ((MadiunMotor) l).prosesTransaksi();
            } else if (l instanceof MadiunMobil) {
                ((MadiunMobil) l).prosesTransaksi();
            }
            System.out.println();
        }
    }
}