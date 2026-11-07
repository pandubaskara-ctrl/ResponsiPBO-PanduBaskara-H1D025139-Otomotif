public class Motor extends Kendaraan implements Servisable {

    public Motor(String platNomor, String merek) {
        super(platNomor, merek);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("INFO MOTOR");
        super.tampilkanInfo();
    }

    @Override
    public void berkendara() {
        if (getBahanBakar() >= 2) {
            setBahanBakar(getBahanBakar() - 2);
            System.out.println("Motor berjalan. Sisa BBM: " + getBahanBakar() + " liter");
        } else {
            System.out.println("Motor gagal jalan: BBM kurang dari 2 liter");
        }
    }

    @Override
    public void servis() {
        System.out.println("Motor " + getPlatNomor() + " diservis");
    }
}