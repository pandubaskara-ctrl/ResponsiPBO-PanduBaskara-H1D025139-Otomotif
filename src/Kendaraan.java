public abstract class Kendaraan {

    public static final int BBM_MAKSIMAL = 50;

    private final String merek;

    private String platNomor;
    private int bahanBakar;

    public Kendaraan(String platNomor, String merek, int bahanBakar) {
        this.platNomor = platNomor;
        this.merek = merek;
        this.bahanBakar = bahanBakar;
    }

    public Kendaraan(String platNomor, String merek) {
        this(platNomor, merek, 0);
    }

    public void tampilkanInfo() {
        System.out.println("Plat  : " + platNomor);
        System.out.println("Merek : " + merek);
        System.out.println("BBM   : " + bahanBakar + " liter");
    }

    public boolean isTangkiKosong() {
        return bahanBakar == 0;
    }

    public abstract void berkendara();

    public String getPlatNomor() { return platNomor; }
    public void setPlatNomor(String platNomor) { this.platNomor = platNomor; }

    public String getMerek() { return merek; }

    public int getBahanBakar() { return bahanBakar; }
    public void setBahanBakar(int bahanBakar) {this.bahanBakar = bahanBakar;
    }
}