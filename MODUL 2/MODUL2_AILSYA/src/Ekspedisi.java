public class Ekspedisi 
{
    // TO DO: Create Protected Attributes of Ekspedisi (jumlahCabang, pusat, tarif)
    protected int jumlahCabang;
    protected String pusat;
    protected float tarif;



    // TO DO: Create Constructor of Ekspedisi
    public Ekspedisi(int jumlahCabang, String pusat, float tarif){
        this.jumlahCabang = jumlahCabang;
        this.pusat = pusat;
        this.tarif = tarif;
 }

    // TO DO: Create 'informasi' Method to show Information
    public void informasi (){
        System.out.println("Informasi Ekspedisi:");
        System.out.println("Jumlah Cabang: " + jumlahCabang);
        System.out.println("Pusat: " + pusat);
        System.out.println("Tarif: " + tarif);
    }
}

