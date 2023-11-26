public class MainApp {
    public static void main(String[] args) {
        
    Mobil mobil = new Mobil("Mobil125", 140.0, 6, 4);
        System.out.println("Informasi Mobil:\n" + mobil.toString());
        System.out.println("Waktu Tempuh dengan Mobil : " + mobil.hitungWaktuTempuh(500.0) + " jam\n");

        Bus bus = new Bus("Bus245", 100.0, 50, 50);
        System.out.println("Informasi Bus:\n" + bus.toString());
        System.out.println("Waktu Tempuh dengan Bus : " + bus.hitungWaktuTempuh(500.0) + " jam");
    }
}
