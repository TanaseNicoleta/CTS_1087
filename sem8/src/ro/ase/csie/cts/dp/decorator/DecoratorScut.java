package ro.ase.csie.cts.dp.decorator;

import ro.ase.csie.cts.dp.adapter.ACMECaracterJoc;

public class DecoratorScut extends DecoratorCaracter {

    int nivelScut;

    public DecoratorScut(ACMECaracterJoc caracter, int nivel) {
        super(caracter);
        this.nivelScut = nivel;
    }

    @Override
    public void esteLovit(int puncte) {
        int puncteLvitura = puncte - this.nivelScut;
        if(puncteLvitura  > 0)
            super.caracter.esteLovit(puncteLvitura);
    }
}
