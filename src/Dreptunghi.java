public class Dreptunghi {
    private double lungime;
    private double latime;

    // Constructor pentru inițializarea lungimii și lățimii
    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    // Metoda pentru calcularea perimetrului
    public double calculeazaPerimetru() {
        return 2 * (lungime + latime);
    }

    // Metoda pentru calcularea ariei
    public double calculeazaArie() {
        return lungime * latime;
    }

    // Metodele de getter pentru lungime și lățime
    public double getLungime() {
        return lungime;
    }

    public double getLatime() {
        return latime;
    }
}
