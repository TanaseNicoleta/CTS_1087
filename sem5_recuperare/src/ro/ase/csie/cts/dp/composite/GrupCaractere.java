package ro.ase.csie.cts.dp.composite;

import java.util.ArrayList;

public class GrupCaractere extends NodStructuraAbstract {
    ArrayList<NodStructuraAbstract> noduri = new ArrayList<>();
    String denumire;

    public GrupCaractere(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void atacaJucator(String numeJucator) {
        for(NodStructuraAbstract nod :noduri)
            nod.atacaJucator(numeJucator);
    }

    @Override
    public void seRetrage() {
        for(NodStructuraAbstract nod :noduri)
            nod.seRetrage();
    }

    @Override
    public void seDeplaseaza() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void adaugaNod(NodStructuraAbstract nod) {
        this.noduri.add(nod);
    }

    @Override
    public void stergeNod(NodStructuraAbstract nod) {
        this.noduri.remove(nod);
    }

    @Override
    public NodStructuraAbstract getNod(int index) {
        return this.noduri.get(index);
    }
}
