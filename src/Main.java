public class Main {
    public static void main(String[] args) {

        System.out.println();
        Mobil mobil = new Mobil("R 1234 AB", "Pajero", 8);
        Motor motor = new Motor("R 5678 CD", "RX King Cobra");
        mobil.tampilkanInfo();
        motor.tampilkanInfo();
        System.out.println("Tangki motor kosong? " + motor.isTangkiKosong());

        System.out.println();
        System.out.println("Kapasitas maksimal tangki: " + Kendaraan.BBM_MAKSIMAL + " liter");
        System.out.println("Merek mobil: " + mobil.getMerek());

        System.out.println();
        mobil.setPlatNomor("AA 8455 NS");
        System.out.println("Plat mobil sekarang: " + mobil.getPlatNomor());

        System.out.println();
        mobil.berkendara();
        mobil.berkendara();
        motor.berkendara();
        motor.setBahanBakar(3);
        motor.berkendara();

        System.out.println();
        BisaIsiBBM pengisi = mobil;
        pengisi.isiBahanBakar(55);

        Servisable s1 = mobil;
        Servisable s2 = motor;
        s1.servis();
        s2.servis();

        System.out.println("\nInfo akhir");
        mobil.tampilkanInfo();
        motor.tampilkanInfo();
    }
}