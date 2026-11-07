public class Mobil extends Kendaraan implements Servisable, BisaIsiBBM {

    public Mobil(String platNomor, String merek, int bahanBakar) {
        super(platNomor, merek, bahanBakar);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("INFO MOBIL");
        super.tampilkanInfo();
    }

    @Override
    public void berkendara() {
        if (getBahanBakar() >= 5) {
            setBahanBakar(getBahanBakar() - 5);
            System.out.println("Mobil berjalan. Sisa BBM: " + getBahanBakar() + " liter");
        } else {
            System.out.println("Mobil gagal jalan: BBM kurang dari 5 liter");
        }
    }

    @Override
    public void isiBahanBakar(int liter) {
        int total = getBahanBakar() + liter;
        if (total > BBM_MAKSIMAL) {
            setBahanBakar(BBM_MAKSIMAL);
            System.out.println("Tangki penuh (maks " + BBM_MAKSIMAL + " liter)");
        } else {
            setBahanBakar(total);
            System.out.println("Mobil diisi " + liter + " liter. Total: " + total + " liter");
        }
    }

    @Override
    public void servis() {
        System.out.println("Mobil " + getPlatNomor() + " diservis");
    }
}