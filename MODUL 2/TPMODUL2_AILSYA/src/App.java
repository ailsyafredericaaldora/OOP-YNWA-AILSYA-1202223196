public class App {
    public static void main(String[] args) throws Exception {
        Mobil myCar = new Mobil("CAR150", 150.0, 6, 4);
        System.out.println("Informasi Mobil:");
        System.out.println(myCar.toString());

        Bus myBus = new Bus("BUS579", 150.0, 50, 50);
        System.out.println("\nInformasi Bus:");
        System.out.println(myBus.toString());

        double jarak = 400.0;
        System.out.println("\nWaktu Tempuh Mobil untuk jarak " + jarak + " km: " + myCar.hitungWaktuTempuh(jarak) + " jam");
        System.out.println("Waktu Tempuh Bus untuk jarak " + jarak + " km: " + myBus.hitungWaktuTempuh(jarak) + " jam");
    }
    }

