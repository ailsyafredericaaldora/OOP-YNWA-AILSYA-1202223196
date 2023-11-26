public class Kendaraan {
     String nomorIdentifikasi;
     double kecepatanMaksimum;
     int kapasitasPenumpang;

    public Kendaraan(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang) {
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String toString() {
        return "Nomor Identifikasi: " + nomorIdentifikasi +
                ", Kecepatan Maksimum: " + kecepatanMaksimum +
                ", Kapasitas Penumpang: " + kapasitasPenumpang;
    }

    public double hitungWaktuTempuh(double jarak) {
        return jarak / kecepatanMaksimum;
    }
}


