public class TelUExpress extends Ekspedisi //...
{
    // TO DO: Create Protected Atribute of TelUExpress(antarInter)
protected boolean antarInter;
    // TO DO: Create Constructor of TelUExpress
    public TelUExpress(int jumlahCabang, String pusat, float tarif, boolean antarInter) {
        super(jumlahCabang, pusat, tarif);
        this.antarInter = antarInter;
}
    // TO DO: Create 'informasi' Method to show Information
    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Layanan Antar Antar Internasional: " + antarInter);
}
    // TO DO: Create 'ambil' Method to pick up a package
 public void ambil(String tempat) {
    System.out.println(tempat);
 }
       // Implementasi pengambilan paket dari tempat tertentu
    public void antar(int resi) {
        System.out.println(resi);
 }
       // Implementasi pengiriman paket dengan nomor resi tunggal
         public void kirim (int resi_1) {
            System.out.println(resi_1);
         }
     // Implementasi pengiriman paket dengan dua nomor resi
    public void kirim1 ( int resi_2){
            System.out.println(resi_2);
    }
    // TO DO: Create 'antar' Method to send a package
    public void antar1(String tempat_antar){
        System.out.println(tempat_antar);
    }
    // TO DO: Create 'antar' Method to send two packages
    public void antar2(String tempat_antar2){
        System.out.println(tempat_antar2);
    }
}
