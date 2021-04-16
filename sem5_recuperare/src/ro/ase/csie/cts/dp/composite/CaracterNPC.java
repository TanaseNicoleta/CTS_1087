package ro.ase.csie.cts.dp.composite;

public class CaracterNPC extends NodStructuraAbstract {
   String nume;
   int putere;

    public CaracterNPC(String nume, int putere) {
        this.nume = nume;
        this.putere = putere;
    }

    @Override
    public void atacaJucator(String numeJucator) {
        System.out.println(String.format("%s ataca pe %s ", nume, numeJucator));
    }

    @Override
    public void seRetrage() {
        System.out.println(String.format("%s se retrage ", nume));
    }

    @Override
    public void seDeplaseaza() {
        System.out.println(String.format("%s se deplaseaza pe ecran ", nume));
    }

    @Override
    public void adaugaNod(NodStructuraAbstract nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(NodStructuraAbstract nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public NodStructuraAbstract getNod(int index) {
        return null;
    }
}
