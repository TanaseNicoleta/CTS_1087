package ro.as.csie.cts.seminar6.dp.builder;

public class Supererou {

    String nume;
    int puncteViata;

    boolean esteNegativ;
    boolean esteRanitGrav;

    //Deep
    InterfataArma armaStanga;
    InterfataArma armaDreapta;
    InterfataSuperputere superputere;
    InterfataSuperputere superSuperputere;

    private Supererou() {
    }

    private Supererou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaStanga, InterfataArma armaDreapta, InterfataSuperputere superputere, InterfataSuperputere superSuperputere) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.esteNegativ = esteNegativ;
        this.esteRanitGrav = esteRanitGrav;
        this.armaStanga = armaStanga;
        this.armaDreapta = armaDreapta;
        this.superputere = superputere;
        this.superSuperputere = superSuperputere;
    }

    public static class SupererouBuilder {
        Supererou supererou;

        public SupererouBuilder(String nume, int puncteViata) {
            this.supererou = new Supererou();
            this.supererou.nume = nume;
            this.supererou.puncteViata = puncteViata;
        }

        public SupererouBuilder esteNegativ() {
            this.supererou.esteNegativ = true;
            return this;
        }

        public SupererouBuilder esteRanit() {
            this.supererou.esteRanitGrav = true;
            return this;
        }

        public SupererouBuilder setArmaStanga(InterfataArma arma) {
            this.supererou.armaStanga = arma;
            return this;
        }

        public SupererouBuilder setArmaDreapte(InterfataArma arma) {
            this.supererou.armaDreapta = arma;
            return this;
        }

        public SupererouBuilder setSuperputere(InterfataSuperputere superputere) {
            this.supererou.superputere = superputere;
            return this;
        }

        public SupererouBuilder setSuperSuperputere(InterfataSuperputere superSuperputere) {
            this.supererou.superSuperputere = superSuperputere;
            return this;
        }

        public Supererou build() {
            return this.supererou;
        }

    }

    @Override
    public String toString() {
        return "Supererou{" +
                "nume='" + nume + '\'' +
                ", puncteViata=" + puncteViata +
                ", esteNegativ=" + esteNegativ +
                ", esteRanitGrav=" + esteRanitGrav +
                ", armaStanga=" + armaStanga +
                ", armaDreapta=" + armaDreapta +
                ", superputere=" + superputere +
                ", superSuperputere=" + superSuperputere +
                '}';
    }
}
